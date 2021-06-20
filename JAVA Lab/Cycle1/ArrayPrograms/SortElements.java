import java.util.*;
class SortElements
{
public static void main(String[] args)
{
Scanner sea=new Scanner(System.in);
System.out.print("Enter the Size: ");
int n=sea.nextInt();
int a[]=new int[n];
System.out.print("Enter elements into array: ");
for(int i=0;i<n;i++)
{
a[i]=sea.nextInt();
}
for(int i=0;i<n;i++)
{
for(int j=i+1;j<n;j++)
{
if(a[i] > a[j])
{
int temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
for(int i=0;i<n;i++)
{
System.out.print(a[i]+" ");
}
}
}