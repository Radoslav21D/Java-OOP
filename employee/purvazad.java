package employee;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class purvazad {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
				
	Scanner sc = new Scanner(System.in);
	FileWriter fw= new FileWriter("slujitel.txt", true);
	String current=""; {
	while(true) {
			current=sc.nextLine();
			if(current.equals("0/0/0")) {
				break;
			}
			fw.write(current+"\n");
}
		fw.close();
		Scanner sc1=new Scanner(new File("slujitel.txt"));
		while(sc1.hasNext()) {
			System.out.println(sc1.nextLine());
		}
		sc1.close();
}
}}
