package Exception;

public class EHan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float res =division(10, 2);
		System.out.println("result:"+res);
		
		int si = StringintoInteger("123");
		System.out.println("Integer:" +si);
	}
	private static float division(int a, int b)
	{ 
		float result=0;
		try {
			result = a/b;
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Will be executed no matter what.");
		}
		return result;
	
	}
	private static int StringintoInteger(String n)
	{
		int num=0;
		try {
			num=Integer.parseInt(n);
		}
		catch(NumberFormatException et)
		{
			System.out.println(et);
		}
		return num;
	}
	

}
