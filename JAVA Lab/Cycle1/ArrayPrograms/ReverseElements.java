import java.util.*;
class ReverseElements
{
public static void main(String[] args)
{
Scanner rs=new Scanner(System.in);
System.out.print("Enter arraySize: ");
int n=rs.nextInt();
int a[]=new int[n];
System.out.print("Enter the elements into array: ");
for(int i=0;i<n;i++)
{
a[i]=rs.nextInt();
}
System.out.print("Reverse of Array elements: ");
for(int i=n-1;i>=0;i--)
{
System.out.print(a[i]+" ");
}
}
}