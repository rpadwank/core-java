class EmployeeTest
{
	public static void main(String args[])
	{

		Employee e1 = new Employee("101","John",20000);
		System.out.println("\n\n");
		e1.displayEmployeeDetails();
		System.out.println("Annual Basic: "+e1.getAnnualBasic());
		
		System.out.println("Monthly Gross Salary: "+ e1.getMonthlyGrossSalary());
		
 		System.out.println("Annual Gross Salary: "+e1.getAnnualGrossSalary());
		
		e1.setPFRate(10);
		
		System.out.println("monthly Deductions: "+e1.getMonthlyDeductions());
		
		System.out.println("Monthly Take Home: "+e1.getMonthlyTakeHome());	

		System.out.println("Annual Take Home: "+e1.getAnnualTakeHome());	
	}
	

				
}
