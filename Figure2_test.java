public class Figure2_test {

	public static void main(String[] args) {
		Cube c=new Cube(3);
		Orb o=new Orb(3.14,2);
		Pyramid p=new Pyramid(5,8,4,3,6);
		System.out.println("Cube");
		c.s();
		c.v();
		System.out.println("Sphere");
		o.s();
		o.v();
		System.out.println("Pyramid");
		p.s();
		p.v();
	}
}
