import java.util.*;
class Averageofarray
{
public static void main(String[] args)
{
Scanner aver=new Scanner(System.in);
int n, i, sum=0;
System.out.print("Enter the Size of array: ");
n=aver.nextInt();
int a[]=new int[n];
System.out.print("Enter elements into array: ");
for(i=0;i<n;i++)
{
a[i] = aver.nextInt();
}
for(i=0;i<n;i++)
{
sum=sum+a[i];
}
System.out.print("Average of Arrayelements: "+sum/n);
}
}