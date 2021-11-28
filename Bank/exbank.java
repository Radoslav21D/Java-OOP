package Bank;

import java.util.Scanner;

public class exbank {
	
	Scanner sc = new Scanner(System.in);
    private String name,surname,lastname;
    private double number,sum;

    public exbank() {
    	
        this.name = sc.next();
        this.setLastname(sc.next());
        this.surname = sc.next();
        this.number= sc.nextDouble();
        this.sum = sc.nextDouble();
    }
    
    public exbank(String i, String f,String p,double n,double sum) {
        this.name=i;
        this.setLastname(f);
        this.surname = p;
        this.number = n;
        this.sum =sum;
        
    }
    
    public String getName() {
        return this.name;
        
    }
    
    public double tSmetka() {
        return this.number;
        
    }
    
    public double getSuma() {
        return this.sum;
        
    }

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
}

