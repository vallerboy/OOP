package pl.akademiakodu.oop;

public class Main {

	public static void main(String[] args) {

	 
		Player[] players = { new Player("Wojtek", "Jaki� tam", 50), new Player("Oskar", "Jaki� tam", 20),new Player("Marzena", "Jaki� tam", 30)};
		Game game = new Game("AkademiaKodu vs Kursanci", players);
		
		System.out.println(game.getWinner());
		
	
	}

}
