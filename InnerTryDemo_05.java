class InnerTryDemo_05
{
	public static void main(String[] args)
	{
		try
		{
			System.out.println("In outer try");
			
			try
			{
				System.out.println("In inner try");
				System.out.println(10/0);
			}
			catch(NumberFormatException nfe)
			{
				System.out.println("In inner catch");
			}
			System.out.println("After inner/try catch"); 
		}
		catch(ArithmeticException nas)
		{
			System.out.println("IN outer catch");
		}
		System.out.println("After outer try/catch");
			
	}
}