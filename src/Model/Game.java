package Model;

import java.util.ArrayList;


public class Game {

	private int numOfPlayers=2;
	private ArrayList<Player> players;
	private Player clickedPlayer;
	private String goodName;
	private String badName;
	private String badLeader;
	private int roundNum=0;
	
	public Game(int numOfPlayers, String good, String bad, String leader){
		this.setNumOfPlayers(numOfPlayers);
		players=new ArrayList<Player>();
		if(good.equals("")){
			goodName="Muggle";
		}else{
			goodName=good;			
		}
		if(bad.equals("")){
			badName="Wizard";
		}else{
			badName=bad;			
		}
		if(leader.equals("")){
			badLeader="Voldemort";
		}else{
			badLeader=leader;			
		}
	}

	public int getNumOfPlayers() {
		return numOfPlayers;
	}

	public void setNumOfPlayers(int numOfPlayers) {
		this.numOfPlayers = numOfPlayers;
	}
	
	public void addPlayer(String name){
		players.add(new Player(name));
	}
	public ArrayList<Player> getPlayers(){
		return players;
	}
	public Player getPlayer(int index){
		return players.get(index);
	}

	public Player getClickedPlayer() {
		return clickedPlayer;
	}

	public void setClickedPlayer(Player clickedPlayer) {
		this.clickedPlayer = clickedPlayer;
	}

	public String getGoodName() {
		return goodName;
	}

	public void setGoodName(String goodName) {
		this.goodName = goodName;
	}

	public String getBadName() {
		return badName;
	}

	public void setBadName(String badName) {
		this.badName = badName;
	}

	public String getBadLeader() {
		return badLeader;
	}

	public void setBadLeader(String badLeader) {
		this.badLeader = badLeader;
	}

	public int getRoundNum() {
		return roundNum;
	}

	public void setRoundNum(int roundNum) {
		this.roundNum = roundNum;
	}
}
