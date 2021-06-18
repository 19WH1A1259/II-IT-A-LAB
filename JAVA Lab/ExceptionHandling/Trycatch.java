import java.util.*;
public class Trycatch
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i=sc.nextInt();
int j=sc.nextInt();
try
{
int data=i/j;
System.out.println(data);
}
catch(Exception e)
{
int data =i+j;
System.out.println("Sum of elements: "+data);
}
System.out.println("rest of the code");
}
}