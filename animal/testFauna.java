package animal;

public class testFauna {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat my1cat=new Cat();
		my1cat.setName("Kitty");
		my1cat.setRegion("Syria"); 
		my1cat.setBrand("Siamese"); 
		//my1cat.setSize(34.5);
		//my1cat.setAge(4);
		System.out.println("Info about my first cat:"); 
		System.out.println("Name:"+my1cat.getName()+"\tBrand:"+my1cat.getBrand()); 
		System.out.println("Size:"+my1cat.size+"\tAge:"+my1cat.age); 
		System.out.println("Fur:"+my1cat.getFur()+"\tRegion:"+my1cat.getRegion());

	}

}
