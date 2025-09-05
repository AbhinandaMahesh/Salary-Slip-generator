
public class project {

	public static void main(String[] args) {
		
		String employeeName = "Abhinanda A M";
		double basicSalary = 30000;
		
		final double HRA_Payments = 0.20;
		final double DA_payments = 0.10;
		
		double hra = basicSalary * HRA_Payments;
		double da = basicSalary * DA_payments;
		double grossSalary = basicSalary + hra + da;
		
		System.out.println("====== Salary Slip =====");
		System.out.println("Employee Name: - " +employeeName);
		System.out.println("Basic Salary: - " +basicSalary);
		System.out.println("HRA: - " +hra);
		System.out.println("DA: - " +da);
		System.out.println("Gross Salary: - "+grossSalary);
		
		
		
	}

}
