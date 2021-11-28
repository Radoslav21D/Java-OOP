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
			System.out.println("��������� �: "+ this.getSalaryforhour()+" ��");
			
		}
		else {
			System.out.println("��������� �: "+ this.getSalaryforhour()*1.5+" ��");
		}
	}
	
	public void output() {
		super.output();
    	System.out.println("��������: ");
    	System.out.println(this.plumber);
    	System.out.println("������� �����: ");
    	System.out.println(this.time+" ����");
    	System.out.println("--------------");
    	
	}
}