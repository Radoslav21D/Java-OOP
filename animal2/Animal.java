package animal2;

public abstract class Animal {
	
	private String name ;
	private int age ;
	private int weight ;

	public Animal(String name, int age, int weight) {
		
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	
	abstract void sing();
	abstract void eat();
	
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
		public int getWeight() {
			return weight;
		}
		public void setWeight(int weight) {
			this.weight = weight;
		}
		public void output() {
			
			System.out.println("Name is");
			System.out.println(this.name);
			System.out.println("Age");
			System.out.println(this.age);
			System.out.println("weight is");
			System.out.println(this.weight);
			
		}
}
