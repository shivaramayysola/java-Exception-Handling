class Example04_FinallyWithReturnValue04
{
	public static void main(String[] args)
	{
				
			m1();
			System.out.println("After m1 calling");
	}
	static void m1()
	{
			try
			{
				System.out.println("In Try");
				System.out.println(10/0);
			}
			catch(NullPointerException npe)
			{
				System.out.println("In catch");
			}
				finally
				{
					System.out.println("In finally");
					return;
				}
				
				
	}
}