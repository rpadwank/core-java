class ComplexNumber
{
	private double real;
	private double imaginary;
	
	public void setData(double real, double imaginary)
	{
		this.real = real;
		this.imaginary = imaginary;
	}

	public void display()
	{
		System.out.print(real);
		if(imaginary>=0)
			System.out.println(" + "+imaginary+" i");
		else
			System.out.println(" - "+Math.abs(imaginary)+" i");
	}

	public ComplexNumber sum(ComplexNumber c2)
	{
		ComplexNumber cn3 = new ComplexNumber();
		cn3.real = real + c2.real;
		cn3.imaginary = imaginary + c2.imaginary;
		return 	cn3;
	}
}
	
		