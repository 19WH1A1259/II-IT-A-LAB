import java.util.*;
class Reversestring
{
public static void main(String args[])
{
Scanner rs=new Scanner(System.in);
System.out.print("Enter a string: ");
char a[]=rs.next().toCharArray();
int i;
for(i=a.length-1;i>=0;i--)
{
System.out.print(a[i]);
}
}
}
