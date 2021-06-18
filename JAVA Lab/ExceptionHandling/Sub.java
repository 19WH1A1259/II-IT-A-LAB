import java.util.*;
public class Sub{
static void Subtract(int a, int b)
{
if(a < b)
throw new ArithmeticException("A is smaller then B");
else
System.out.println(a-b);
}
public static void main(String[] args)
{
System.out.println("Enter 2 numbers");
Scanner num=new Scanner(System.in);
int a=num.nextInt();
int b=num.nextInt();
Subtract(a, b);
System.out.println("End of Execution");
}
}