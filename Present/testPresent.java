package Present;

import java.util.Scanner;

public class testPresent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Въведи броят на подаръците");
		int n=sc.nextInt();
		Present[]presents=new Present[n];
		for(int i=0; i<n;i++) {
			
			String name;
			double price;
			double height;
			double width;
			String colour;
			String receiver;
			
			if(i==0) {sc.nextLine();}
			
			System.out.println("Въведи име: ");
			name=sc.nextLine();
			System.out.println("Въведи цена: ");
			price=sc.nextDouble();
			System.out.println("Въведи височина: ");
			height=sc.nextDouble();
			System.out.println("Въведи широчина: ");
			width=sc.nextDouble();
			System.out.println("Въведи цвят: ");
			sc.nextLine();
			colour=sc.nextLine();
			System.out.println("Въведи получател: ");
			receiver=sc.nextLine();
			System.out.println("--------------------------");
			
			Present present=new Present(name, price, height, width, colour, receiver);
				presents[i]=present;
				
			}
		int counter=1;
		for(int i=0; i<n;i++) {
			
			Present present=presents[i];
			
			System.out.println("--------------------------");
			System.out.println("Подарък № "+ counter);
			System.out.println("Име: "+ present.getName());
			System.out.println("Цена: "+present.getPrice());
			System.out.println("Височина: "+present.getHeight());
			System.out.println("Широчина: "+present.getWidth());
			System.out.println("Цвят: "+present.getColour());
			System.out.println("Получател: "+present.getReceiver());
			
			counter++;
		}

	}

}
