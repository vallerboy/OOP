package pl.akademiakodu.oop;

public class Car {

	 private int price; 
	 private String model; 
	 private String brand;
	 
	 
	public Car(int price, String model, String brand) {
		this.price = price;
		this.model = model;
		this.brand = brand;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	} 
	 
	public void show() { 
		System.out.println("Marka samochodu: " + brand + " Cena: " + price);
	}
	 
	 
}
