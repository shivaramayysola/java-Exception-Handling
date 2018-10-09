class Example_ReturnInnerFinallyBlock04
{
	public static void main(String[] args)
	{
			m1();
	}
		static void m1()
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
					
				}
					System.out.println("After Inner try/catch/finally");
			}
			catch(NullPointerException npe)
			{
				System.out.println("In outer catch");
			}
			finally
			{
				System.out.println("In outer final");
				
			}
				System.out.println("After outer try.catch/finally");
		}		
	
}