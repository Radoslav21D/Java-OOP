package Worker.src;

public class HourlyWorker extends Worker {
	
	private String plumber;
	private int time;
	
	public HourlyWorker(String name, int salaryforhour, String plumber, int time) {
		super(name,salaryforhour);
		this.plumber = plumber;
		this.time = time;
	}

	public String getPlumber() {
		return plumber;
	}

	public void setPlumber(String plumber) {
		this.plumber = plumber;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	
	void getweeklysalary() {
		if (time <= 40) {
			System.out.println("Заплатата е: "+ this.getSalaryforhour()+" лв");
			
		}
		else {
			System.out.println("Заплатата е: "+ this.getSalaryforhour()*1.5+" лв");
		}
	}
	
	public void output() {
		super.output();
    	System.out.println("Професия: ");
    	System.out.println(this.plumber);
    	System.out.println("Работно време: ");
    	System.out.println(this.time+" часа");
    	System.out.println("--------------");
    	
	}
}