import java.util.*;
class GradeofStudent
{
public static void main(String[] args)
{
Scanner cgs=new Scanner(System.in);
int sum=0, aver;
int n=cgs.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
System.out.print("Enter marks of Subject"+(i+1)+" :");
a[i]=cgs.nextInt();
}
for(int i=0;i<n;i++)
{
sum = sum + a[i];
}
aver=sum/n;
if(aver >= 80)
{
System.out.print("The Grade of Student: A");
}
else if(aver>=60 && aver<80)
{
System.out.print("The Grade of Student: B");
}
else if(aver>=40 && aver <60)
{
System.out.print("The Grade of Student: C");
}
else
{
System.out.print("The Grade of Student: D");
}
}
}
