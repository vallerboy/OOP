package pl.akademiakodu.oop;

public class Main {

	public static void main(String[] args) {

		// Stworzenie kodu na innym kostruktorze (ale ta sama klasa), bez
		// setter�w
		GetterSetter obiekt1 = new GetterSetter("AkademiaKodu.pl", "Oskar", 20);

		System.out.println(obiekt1.getTitle());

		obiekt1.setTitle("Tutaj nowy tytu�");

		System.out.println(obiekt1.getTitle());
		
		
	
	}

}
