class Test
{
	public static void main(String[] args)
	{
		try
		{
			System.out.println(10/0);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("getMessage() method output");
			System.out.println(ae.getMessage());
			System.out.println("==========\n");
			
			System.out.println("toString() method output");
			System.out.println(ae.toString());
			System.out.println("===============\n");
			
			System.out.println("printStackTrace() method output");
			ae.printStackTrace();
			System.out.println("=================\n");
			
			System.out.println("JVM default output");
			/** By using above statement we are just re-throwing the caught
				exception,this exception is caught by jvm default handler and prints
				full exception message along with thread name*/
			
		}
	}
}

/** 
Test cases
D:\java programs\Exception Handling>javac Test.java

D:\java programs\Exception Handling>java Test
getMessage() method output
/ by zero
==========

toString() method output
java.lang.ArithmeticException: / by zero
===============

printStackTrace() method output
java.lang.ArithmeticException: / by zero
        at Test.main(Test.java:7)
=================

JVM default output

*/