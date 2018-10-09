class Example_FinallyBreakContinue01
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
				return 10;
			}
			finally
			{
				continue;
			}
		}
		return 20;
	}
}