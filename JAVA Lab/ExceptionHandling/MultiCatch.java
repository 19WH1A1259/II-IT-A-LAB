import java.util.*;
public class MultiCatch{
	public static void main(String[] args){
		
	try{
		Scanner n=new Scanner(System.in);
		int a, b, c;
		a=n.nextInt();
		b=n.nextInt();
		int d[]=new int[10];
		c=a/b;
		d[9] = c;
		System.out.println(d[9]);
	   }
	   catch(ArithmeticException e)//ArithmeticException e
		{
		System.out.println("Arithmetic Exception occured");
		}
	   catch(ArrayIndexOutOfBoundsException e)//ArrayIndexOutOfBoundsException e
		{
		System.out.println("Array out of bound occured");
		}
	  catch(Exception e)
		{
		System.out.println("Exception occured");
		}
		
		System.out.println("Rest of the code");
	}
}	