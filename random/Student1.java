package random;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner; 
	
public class Student1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	Scanner reader = new Scanner (new FileReader("C:\\Users\\green\\Desktop\\Student.txt"));
	while(reader.hasNextLine()) {
		System.out.println(reader.nextLine());
	}
reader.close();
}catch(FileNotFoundException e) {
	}

}
}
