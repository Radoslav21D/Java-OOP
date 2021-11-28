package IS1.Praktikum;

import java.util.ArrayList;

public class Avtokushta{


    private ArrayList<cars> car=new ArrayList<cars>();


    public void addCar(int n) {
        int g=0;
        cars c1=new cars();
        for(int i=0;i<car.size();i++) 
        if(c1.getModel().equals(car.get(i).getModel()))g++;
        if(g==0)car.add(c1);
        else {
            System.out.println("razpoga s takava kola");
            System.out.println();
        }

    }
    public void addCar1(cars a) {
        int g=0;
        for(int i=0;i<car.size();i++) 
            if(a.getModel().equals(car.get(i).getModel()))g++;
        if(g==0)car.add(a);
        else {
            System.out.println();
        }}


    public cars getCar(int n) {
        return car.get(n);
    }

    public void getInfo() {
        for(int i=0;i<car.size();i++)car.get(i).getInfo();
        System.out.println("resultat:");
    }

    public void getInfoCar(String n) {
         for(int i=0;i<car.size();i++)if(car.get(i).getModel().equals(n))
             car.get(i).getInfo();
         else if(n.equals(""))for(int i1=0;i1<car.size();i1++)car.get(i1).getInfo();

    }




}

