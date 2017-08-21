package Controller;

import Model.Game;
import Model.Player;

public class InfoGiver {
	
	Game game;
	Player clickedPlayer;
	
	public InfoGiver(Game game, String nameOfPlayer){
		
		this.game=game;
		
		for(Player p:game.getPlayers()){
			if(nameOfPlayer.equals(p.getName())){
				clickedPlayer=p;
			}
		}
	}
	
	public void updatePlayerMainButton(){
		if(!clickedPlayer.getAlreadyClicked().equals("primary")){
			clickedPlayer.setAlreadyClicked("illegal");
		}else{
			clickedPlayer.setAlreadyClicked("alreadyClicked");
		}
		game.setClickedPlayer(clickedPlayer);
	}
	
	public void updatePlayerPeekButton(){
		if(!clickedPlayer.getPeekClicked().equals("primary")){
			clickedPlayer.setPeekClicked("illegal");
		}else{
			clickedPlayer.setPeekClicked("alreadyClicked");
		}
		game.setClickedPlayer(clickedPlayer);
	}
	
	public Game getGame(){
		return game;
	}
	
	

}
