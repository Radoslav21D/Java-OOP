package Fraction;

public class Fraction1 {

private int num;
private int denom;

public Fraction1() {
	num=0;
	denom=1;
}
public Fraction1(int n,int d) {
	num=n;
	if(d!=0) {
	denom=d;
	}
	else
		{System.out.println("Деление на нула!");return;}
	norm();
}

private int gcd(int a,int b) {
	while(a!=b) {
		if(a>b) {
			a=a-b;
		}
		else {
			b=b-a;
		}	
	}
	return a;
}
private void norm() {
	int i=gcd(Math.abs(num), Math.abs(denom));
	num=num/i;
	denom=denom/i;
}

public String toString(){//overriding the toString() method  
	  return num+"/"+denom;  
	 }  

}
