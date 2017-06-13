

class MultiCatch
{
	
	public static void main(String [] args)
	{
		try
		{
			 int a=0;
			 int b=34/a;
			 int c[]={45,89};
			 c[88]=99;
			
		}
		catch(ArithmeticException | ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Caught " +e);
		}
		
		
	}
}