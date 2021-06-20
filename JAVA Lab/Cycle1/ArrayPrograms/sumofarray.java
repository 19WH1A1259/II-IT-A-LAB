import java.util.*;
class sumofarray
{
public static void main(String[] args)
{
int sum = 0;
Scanner n = new Scanner(System.in);
System.out.println("Enter the size of array");
int numb = n.nextInt();
int a[] = new int[numb];
System.out.println("Enter the elements into array: ");
for(int i=0;i<numb;i++)
{
a[i] = n.nextInt();
}
for(int i=0;i<numb;i++)
{
 sum = sum + a[i];
}
System.out.print("Sum of Elements: " +sum);
}
}