class ExecutionWithException
{
	public static void main(String[] args)
	{
		int a = 20;
		int b = 0;
		System.out.println("a value: "+a);
		System.out.println("b value: "+b);
		
		int c = a/b;             /**Exception in thread "main" java.lang.ArithmeticException: / by zero
									at ExecutionWithException.main(ExecutionWithException.java:10)*/
		System.out.println("c value :"+c);
	}
}