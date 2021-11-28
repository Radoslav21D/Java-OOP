package IS1.Praktikum;

import java.util.Scanner;


public class testAvtokushta {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        Avtokushta c=new Avtokushta();

        cars c1=new cars("honda","benzin","04.07.2001",200,15);
        c.addCar1(c1);
        cars c2= new cars ("vw","dizel","17.02.2013",2000,20);
        c.addCar1(c2);

        c.getInfo();

    }

}

