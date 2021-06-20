import java.util.*;
class CompoundInterest
{
public static void main(String arg[])
{
Scanner sum=new Scanner(System.in);
int  pm, t;                                // pm = principle amount , t = time, r = rate
double r, a1, a2;
System.out.print("Principle Amount: ");
pm=sum.nextInt();
System.out.print("Time: ");
t=sum.nextInt();
System.out.print("Rate: ");
r=sum.nextDouble();
a1=Math.pow(1+(r/100), t);
a2=pm * a1;
System.out.print("Compound amount: "+a2);
}
}