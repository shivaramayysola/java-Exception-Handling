class Example_FinallyBreakContinue07
{
	public static void main(String[] args)
	{
		System.out.println(m1(5));
	}
	static int m1(int i)
	{
		 while(i==5)
		 {
			try
			{
				try
				{
					i = 10;
					
				}
				finally
				{
					 i = 20;
				}
				i = 30;
				return i;
			}
			finally
			{
				if(i==30)
				{
					continue;
				}
			}
		 }
		 return 40;
	}
}