class Employee
{
	private float PFRate;
	private String employeeId;
	private	String employeeName;
	private	int monthlyBasic;
	static final int MEDICAL_ALLOWANCE = 1250;
	static final int CONVEYANCE_ALLOWANCE = 800;

	public Employee(String employeeId, String employeeName, int monthlyBasic)
	{
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.monthlyBasic = monthlyBasic;
	}
	public void displayEmployeeDetails()
	{
		System.out.println("ID: "+employeeId);
		System.out.println("Name: "+employeeName);
		System.out.println("\nMonthly Basic: "+monthlyBasic);

	}
	public int getAnnualBasic()
	{
		return (12 * monthlyBasic);
	}
	
	public float getMonthlyGrossSalary()
	{
		float hra = 50*monthlyBasic/100;
		float monthlyGrossSalary = monthlyBasic + hra + MEDICAL_ALLOWANCE + CONVEYANCE_ALLOWANCE;	
		return monthlyGrossSalary;
	}
	
	public float getAnnualGrossSalary()
	{
		float annualGrossSalary = getMonthlyGrossSalary() * 12;
		return annualGrossSalary;
	}
	
	public float getMonthlyDeductions()
	{
		float providentFund;
		float esic = 0;		
		float profTax;
		float monthlyDeductions;
		float PFRate = getPFRate();
		providentFund = PFRate*monthlyBasic/100;
		if(providentFund > 6500)
			providentFund = 6500;
		if(monthlyBasic<=5000)
			esic =(float) 4.75 * monthlyBasic/100;
		if(monthlyBasic<=10000)
			profTax = 50;
		else
			profTax = 100;
		monthlyDeductions = providentFund + esic + profTax;
		return monthlyDeductions;
	}
	
	public float getMonthlyTakeHome()
	{
		float monthlyTakeHome = getMonthlyGrossSalary() - getMonthlyDeductions();
		return monthlyTakeHome;
	}
	
	public float getAnnualTakeHome()
	{
		float annualTakeHome = getMonthlyTakeHome() * 12;
		return annualTakeHome;
	}
	
	public void setPFRate(float f)
	{
		PFRate = f;
	}
	
	public float getPFRate()
	{
		return PFRate;
	}
}