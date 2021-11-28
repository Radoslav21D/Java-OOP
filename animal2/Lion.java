package animal2;

public class Lion extends Animal {
	private String gen;
	
	public Lion(String name, int age, int weight, String gen) {
		super(name, age, weight);
		this.gen = gen;
	}
	public String getGen() {
		return gen;
	}
	public void setGen(String gen) {
		this.gen = gen;
	}
	public void sing() {
		System.out.println(this.getName() + (this.getAge()+" age ") + " it revs");
	}
	public void eat() {
		System.out.println(this.getName() + (this.getAge() + " age ") + " it eats meat");
	}
	public void output() {
		super.output();
		
		System.out.println("Sex is: ");
		System.out.println(this.gen);
		System.out.println(".............");
		
	}

}
