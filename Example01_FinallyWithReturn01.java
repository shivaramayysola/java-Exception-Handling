class Example01_FinallyWithReturn01
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
				return 10/0;
			}
				finally
				{
					System.out.println("In finally");
					return 20;
				}
				System.out.println("After try/finally");
				return 30;
	}
}