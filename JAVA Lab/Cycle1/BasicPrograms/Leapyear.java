import java.util.*;
class Leapyear
{
public static void main(String[] args)
{
Scanner n=new Scanner(System.in);
System.out.println("enter a number: ");
int a=n.nextInt();
if(((a % 4 == 0) && (a % 100 != 0))|| (a % 400 == 0))
{
System.out.println(a+" is a leap year");
}
else
{
System.out.println(a+" is not a leap year");
}
}
}