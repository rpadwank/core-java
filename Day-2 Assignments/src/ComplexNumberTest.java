class ComplexNumberTest
{
	public static void main(String args[])
	{

		ComplexNumber cn1 = new ComplexNumber();
		cn1.setRealNumber(2);
		cn1.setImaginaryNumber(5);
		
		ComplexNumber cn2 = new ComplexNumber();
		cn2.setRealNumber(-1);
		cn2.setImaginaryNumber(-7);
		
		ComplexNumber cn3;
		cn1.display();
		cn2.display();

		cn3 = cn1.sum(cn2);
	
		cn3.display();
		
	}
}