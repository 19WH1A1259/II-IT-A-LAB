import java.util.*;
class Palindromeforwhile
{
public static void main(String[] args)
{
Scanner pfw=new Scanner(System.in);
String reverseString="";
System.out.print("Enter a string: ");
String str=pfw.nextLine();
for(int i=str.length()-1;i>=0;i--)
{
reverseString=reverseString+str.charAt(i);
}
if(str.equals(reverseString))
{
System.out.print(str+ " is a Palindromestring");
}
else
{
System.out.print(str+ " is not a Palindromestring");
}
}
}