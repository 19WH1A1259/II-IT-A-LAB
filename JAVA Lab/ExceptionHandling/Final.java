import java.util.*;
public class Final{
	public static void main(String[] args){
	
	Scanner n=new Scanner(System.in);
		int a, b, c;
		a=n.nextInt();
		b=n.nextInt();
	try
	{	c=a/b;
		System.out.println("result: "+c);
	}
	catch(Exception e)
	{
		System.out.println("Exception occured");
	}
	finally
	{
		System.out.println("Exceution enter in the Final block");
	}
	System.out.println("End of the Code");
			}


}
 