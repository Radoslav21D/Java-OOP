package animal2;

public class Bird extends Animal {
	private String colour;
	
	public Bird(String name, int age, int weight, String colour) {
		super(name, age, weight);
		this.colour = colour;
	}
	public String getColour() {
		return colour;	
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	void sing() {
		System.out.println(this.getName() + (this.getAge() + " age ") + "it sings");
	}
	void eat() {
		System.out.println(this.getName() + (this.getAge() + " age ") + "and it eat seeds");
	}
	public void output() {
		super.output();
		
		System.out.println("The colour is");
		System.out.println(this.colour);
		
	}

}
