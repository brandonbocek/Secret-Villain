package Controller;

import java.util.ArrayList;
import java.util.Collections;

import Model.Game;
import Model.Player;

public class PlayerRandomizer {

	private Game game;
	private ArrayList<Player> players;
	//5-6: 1 bad, 7-8:2 bad, 9-10: 3 bad 
	private int numOfBad=0;
	private int numAssigned=0;
	
	public PlayerRandomizer(Game game){
		this.game=game;
		resetClickStatus();
		int round = game.getRoundNum()+1;
		game.setRoundNum(round);
	}
	
	private void assignNumbers(){
		switch(players.size()){
			case 5:
			case 6:
				numOfBad=1;
				break;
			case 7:
			case 8:
				numOfBad=2;
				break;
			case 9:
			case 10:
				numOfBad=3;
				break;
		}
	}
	
	
	public void assignPlayers(){
		players = game.getPlayers();
		assignNumbers();
		Collections.shuffle(players);
		
		for(Player p : players){
			if(numAssigned < numOfBad){
				p.setParty(game.getBadName());
				p.setAssignment(game.getBadName());
				numAssigned++;
			}else if(numAssigned==numOfBad){
				p.setParty(game.getBadName());
				p.setAssignment(game.getBadLeader());
				numAssigned++;
			}else{
				p.setParty(game.getGoodName());
				p.setAssignment(game.getGoodName());
			}
		}
		Collections.shuffle(players);
	}
	
	private void resetClickStatus(){
		for(Player p: game.getPlayers()){
			p.setAlreadyClicked("primary");
			p.setPeekClicked("primary");
		}
	}
}
