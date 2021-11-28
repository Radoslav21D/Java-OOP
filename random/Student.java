package random;

import java.io.FileNotFoundException;
import java.io.PrintWriter;


public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
PrintWriter out = null;
try {
	out = new PrintWriter("C:\\Users\\green\\Desktop\\Student.txt");
	out.printf("Ivan 17 \n");
	out.printf("Gosho 17 \n");
	out.printf("Drago 17 \n");
	out.printf("Lubeto 17 \n");
	out.printf("Lubo 17 \n");
	out.printf("Teo 17 \n");
	out.printf("Dani 17 \n");
	out.printf("Petio 17 \n");
}catch(FileNotFoundException e) {
	e.printStackTrace();
}finally {
	if (out!=null)
		out.close();
}
	}

}
