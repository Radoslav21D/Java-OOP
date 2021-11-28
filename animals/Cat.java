package animals;

public class Cat extends Animal {
	public Cat(String name, int age) {
		super(name, age);
	}
	@Override 
	public String IMakeTrick() {
		System.out.println("My name is "+ this.getName()+" . I am"+this.getAge()+" years old");
		System.out.println("No trick for you! I'm too lazy!");
		return null;
	}
	@Override
	public String IMakeNoise() {
		System.out.println("Meow!");
		return null;
	}
	@Override
	public String MakeNoise() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String MakeTrick() {
		// TODO Auto-generated method stub
		return null;
	}

}
