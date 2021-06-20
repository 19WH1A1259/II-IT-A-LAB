import java.util.*;
class Powerofnumber
{
public static void main(String args[])
{
Scanner p=new Scanner(System.in);
int a, b; 
double c;
System.out.print("Enter 2 numbers: ");
a=p.nextInt();
b=p.nextInt();
c=Math.pow(a, b);
System.out.print("Power of number: "+c);
}
}