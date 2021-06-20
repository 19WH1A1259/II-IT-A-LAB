import java.util.*;
class SwitchCase
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
double n1, n2, output;
System.out.print("Enter 2 number: ");
n1=sc.nextDouble();
n2=sc.nextDouble();
System.out.print("Enter operator: ");
char operator=sc.next().charAt(0);
switch(operator)
{
case '+':
{
output=n1+n2;
break;
}
case '-':
{
output=n1-n2;
break;
}
default:
System.out.print("You Entered operator is not defined");
return;
}
System.out.println(n1+" "+operator+" "+n2+" = "+output);
}
}