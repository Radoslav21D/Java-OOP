package Worker.src;


public class Worker_test {

	public static void main(String[] args) {
		HourlyWorker hw=new HourlyWorker("�.������",50,"�������������",48);
		SalariedWorker sw=new SalariedWorker("�.��������",50,"����������� ������",32);
		hw.output();
		sw.output();
		hw.getweeklysalary();
		System.out.println("-----------");
		sw.getweeklysalary();

	}

}
