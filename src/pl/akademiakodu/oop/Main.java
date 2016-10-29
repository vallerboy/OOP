package pl.akademiakodu.oop;

public class Main {

	public static void main(String[] args) {
	
		//  Stworzenie obiektu na pustym kostrzuktorze, z u¿yciem setterów.
		GetterSetter obiekt = new GetterSetter();
		obiekt.setAuthor("OskarP");
		obiekt.setPages(24);
		obiekt.setTitle("AkademiaKodu z pustego kons.");
		
		
		// Stworzenie kodu na innym kostruktorze (ale ta sama klasa), bez setterów
		GetterSetter obiekt1 = new GetterSetter("AkademiaKodu.pl", "Oskar", 20);
		 
		System.out.println(obiekt.getTitle());
		System.out.println(obiekt1.getTitle());
	}

}
