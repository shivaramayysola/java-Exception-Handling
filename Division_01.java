class Division_01
{
	public static void main(String[] args)
	{
		try
		{
					int a = Integer.parseInt(args[0]);
					int b = Integer.parseInt(args[1]);
					
					int c  = a/b;
					System.out.println(c);
		}
		catch(ArrayIndexOutOfBoundsException aiob)
		{
			System.out.println("Please pass atleast two integer values");
		}
		catch(NumberFormatException nfe)
		{
			System.out.println("Please pass only integer values ");
		}
		catch(ArithmeticException ae)
		{
			System.out.println("please do not enter second values as zero");
		}
	 }
}


/** 
TEST CASES
D:\java programs\Exception Handling>javac Division_01.java

D:\java programs\Exception Handling>java Division_01 40 20
2

D:\java programs\Exception Handling>java Division_01
Please pass atleast two integer values

D:\java programs\Exception Handling>java Division_01 40 0
please do not enter second values as zero

D:\java programs\Exception Handling>java Division_01 40 a
Please pass only integer values
*/