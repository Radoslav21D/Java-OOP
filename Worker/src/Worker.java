package Worker.src;


abstract class Worker {
	private String name;
	private int salaryforhour;
	
	public Worker(String name, int salaryforhour) {
		this.name = name;
		this.salaryforhour = salaryforhour;
	
	}

     abstract void getweeklysalary();
     

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalaryforhour() {
		return salaryforhour;
	}

	public void setSalaryforhour(int salaryforhour) {
		this.salaryforhour = salaryforhour;
	}
	 public void output() {
	    	System.out.println("Име: ");
	    	System.out.println(this.name);
	    	System.out.println("Заплата: ");
	    	System.out.println(this.salaryforhour+" лв");
	    	
	 }
}
