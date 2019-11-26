package parties;

public class Laptop implements Comparable<Laptop>{

	private String brand;
	
	public int price;
	
	public int ram;

	public String getBrand() {
		return brand;
	}

	public int getPrice() {
		return price;
	}

	public int getRam() {
		return ram;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", price=" + price + ", ram=" + ram + "]";
	}

	public Laptop(String brand, int price, int ram) {
		super();
		this.brand = brand;
		this.price = price;
		this.ram = ram;
	}

	@Override
	public int compareTo(Laptop laptop2) {
		if(this.getRam() > laptop2.getRam())
		return 1;
		else
		return -1;
	}

	 
	
	
}
