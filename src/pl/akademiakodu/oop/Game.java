package pl.akademiakodu.oop;

public class Game {
 
	 private String name; 
	 private Player[] players;
	 
	public Game(String name, Player[] players) {
		super();
		this.name = name;
		this.players = players;
	} 
	
	
	public String getWinner() { 
		
		int max = 0;
		int tempIndex = 0;
		for(int i = 0; i < players.length; i++) { 
			if(max < players[i].getScore()) { 
				max = players[i].getScore();
				tempIndex = i; 
			}
		}
		
		
		return players[tempIndex].fullName(); 
	}
	 
	 
}
