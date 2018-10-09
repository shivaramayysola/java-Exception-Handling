class Example_IfCondition
{
	public static void main(String[] args)
	{
			
			System.out.println(m1());
	}
	static int m1()
	{
			try
			{
				System.out.println("In Try");
				return 10;
			}
			catch(ArithmeticException ae)
			{
				System.out.println("In catch");
			}
				finally
				{
					System.out.println("In finally");
					if(true)
					{
						return 30;
					}
				}
				return;
				System.out.println("After try/catch/finally");
				
	
	}
	
}