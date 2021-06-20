import java.util.*;
class SimpleInterest
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int pm, t;
double r, amount;
System.out.print("Principle Amount: ");
pm=s.nextInt();
System.out.print("Time: ");
t=s.nextInt();
System.out.print("Rate: ");
r=s.nextDouble();
amount=(pm * t * r)/100;
System.out.print("Simple Interest: "+amount);
}
}

