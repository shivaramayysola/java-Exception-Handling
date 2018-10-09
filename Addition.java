class Addition 
{
	public static void main(String[] args)
	{
		try
		{
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			
			int c = a/b;
			System.out.println("Result : "+(a+b));
		}
		catch(ArrayIndexOutOfBoundsException aiobe)
		{
			System.out.println("Result:"+(4+5));
		}
		catch(NumberFormatException nfe)
		{
			System.out.println("Result:"+(6+7));
		}
		catch(Arithmetic Exception ae)
		{
			System.out.println("Result :"+(8+9));
		}
	}
}