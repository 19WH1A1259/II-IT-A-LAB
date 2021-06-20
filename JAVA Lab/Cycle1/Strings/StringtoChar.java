import java.util.*;
class StringtoChar
{
public static void main(String args[])
{
Scanner str=new Scanner(System.in);
System.out.print("Enter a string: ");
String s=str.nextLine();
char ch=s.charAt(0);
System.out.print("Char from String: "+ch);
}
}
