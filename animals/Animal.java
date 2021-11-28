package animals;

abstract class Animal implements IMakeNoise, IMakeTrick {
	private String name;
	private int age;
	
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String IMakeTrick() {
		System.out.println("My name is "+ this.getName()+" . I am "+this.getAge()+" year old");
		return null;
	}
	
	@Override
	public String IMakeNoise() {
		System.out.println("Look at my trick!");
		return null;
	}
}
