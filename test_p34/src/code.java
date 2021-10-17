public class code
{

	
	public static void main(String[] args)
	{
		int num1 = 10 ;
		int num2 = 5 ;
		System.out.println("num1與num2的各種運算");
		System.out.println("num1+num2 ="+(num1+num2));
		System.out.println("num1-num2 ="+(num1-num2));
		System.out.println("num1*num2 ="+(num1*num2));
		System.out.println("num1/num2 ="+(num1/num2));
		System.out.println("num1%num2 ="+(num1%num2));
	
		int a = 0 ;
		int b = 0 ;
		int c = 0 ;
		
		b=a++ ;
		c=++a ;
		System.out.println("指定值後遞增，所以b值為"+b);
		System.out.println("遞增後指定值，所以c值為"+c);
	}
}
