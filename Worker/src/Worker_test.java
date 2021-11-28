package Worker.src;


public class Worker_test {

	public static void main(String[] args) {
		HourlyWorker hw=new HourlyWorker("Г.Иванов",50,"Водопроводчик",48);
		SalariedWorker sw=new SalariedWorker("И.Георгиев",50,"Таксиметров шофьор",32);
		hw.output();
		sw.output();
		hw.getweeklysalary();
		System.out.println("-----------");
		sw.getweeklysalary();

	}

}
