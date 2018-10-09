class InnerTryDemo_08
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
			catch(ArithmeticException ae)
			{
				System.out.println("In inner catch");
				System.out.println(10/0);
			}
			System.out.println("After inner/try catch"); 
		}
		catch(NumberFormatException nfe)
		{
			System.out.println("IN outer catch");
		}
		System.out.println("After outer try/catch");
			
	}
}