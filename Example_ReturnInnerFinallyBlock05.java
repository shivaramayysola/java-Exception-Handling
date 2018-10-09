class Example_ReturnInnerFinallyBlock05
{
	public static void main(String[] args)
	{
			System.out.println(m1());
	}
		static int m1()
		{
			try
			{
				System.out.println("In Outer try");
				try
				{
						System.out.println("In Inner try");
						System.out.println(10/0);
				}
				catch(NullPointerException npe)
				{
					System.out.println("In inner catch");
				}
				finally
				{
					System.out.println(" in Inner finally");
					return 20;
				}
					//System.out.println("After Inner try/catch/finally");
			}
			catch(NullPointerException npe)
			{
				System.out.println("In outer catch");
			}
			finally
			{
				System.out.println("In outer final");
				
			}
				//System.out.println("After outer try.catch/finally");
				return 30;
	}	
	
}