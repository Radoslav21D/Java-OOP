package animal;

public class Cat extends Mammals {
	private String name, brand;

	public Cat() {
		super();
	}

	public Cat(boolean f, String r, String name, String brand) {
		super(f, r);
		this.name = name;
		this.brand = brand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String printInfo() {
		return "\nName:" + this.getName() + "\nBrand:" + this.getBrand() + super.printInfo();
	}

}
