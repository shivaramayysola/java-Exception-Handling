class Example_Exception
{
	public static void main(String[] args)
	{
		try
		{
			System.out.println("In Try 1");
		}
		catch(Exception e)
		{
			System.out.println("In catch 1");
		}
		
		System.out.println("after try/catch 1");
		try
		{
			System.out.println("In try 2");
		}
		catch(Exception e)
		{
			System.out.println("In catch 2");
		}
		System.out.println("after try/catch 2");
	}
}

/** 
Test Cases
D:\java programs\Exception Handling>javac Example_Exception.java

D:\java programs\Exception Handling>java Example_Exception
In Try 1
after try/catch 1
In try 2
after try/catch 2
*/