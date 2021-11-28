package Pictures;

import java.util.Scanner;

public class testPics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		pictures p=new pictures();
		picture p1=new picture("picture1","pecata",30,"28.02.1958","12345");
		p.addPic2(p1);
		picture p2=new picture("picture2","vankataivanov",40,"12.04.1778","1234");
		p.addPic2(p2);
		picture p3=new picture("picture3","radoraikov",40,"22.07.1989","123");
		p.addPic2(p3);
		picture p4=new picture("picture4","pacokolev",50,"19.11.1892","12");
		p.addPic2(p4);
		
		p.getInfo();
		p.maxPrice();
		//p.removePicUN("123");	    
		
			
		
		   	    	    
		}

	
	

}
