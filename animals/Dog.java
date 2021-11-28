package animals;

public class Dog extends Animal {
	public Dog(String name, int age) {
		super(name, age);
	}
	@Override
	public String IMakeTrick() {
		System.out.println("My name is "+ this.getName()+" . I am "+this.getAge()+" years old");
		System.out.println("Hold my paw,human!");
		return null;
	}
	@Override
	public String IMakeNoise() {
		System.out.println("Woof!");
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

