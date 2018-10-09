class Example02_FinallyWithContinue
{
	public static void main(String[] args)
	{
		for(int i=1;i<= 10 ; i++)
		{	
			System.out.println("\nIn loop :"+i);
			try
			{
				System.out.println("In Try");
				if(i==5)
				{
					continue;
				}
			}
				finally
				{
					System.out.println("In finally");
				}
				System.out.println("After Try finally");
		}
		System.out.println("\nAfter loop ");
		
	}
}