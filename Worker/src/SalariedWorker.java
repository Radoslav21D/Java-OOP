package Worker.src;

public class SalariedWorker extends Worker {
	
	private String taxi;
	private int time;
	
	public SalariedWorker(String name, int salary, String taxi, int time) {
		super(name,salary);
		this.taxi = taxi;
		this.time = time;
	}

	public String getTaxi() {
		return taxi;
	}



	public void setTaxi(String taxi) {
		this.taxi = taxi;
	}



	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	
	void getweeklysalary() {
		System.out.println("��������� �: "+this.getTime()*this.getSalaryforhour()+" ��");
		
	   }
	public void output() {
		super.output();
    	System.out.println("��������: ");
    	System.out.println(this.taxi);
    	System.out.println("������� �����: ");
    	System.out.println(this.time+" ����");
    	System.out.println("--------------");
	}
	}