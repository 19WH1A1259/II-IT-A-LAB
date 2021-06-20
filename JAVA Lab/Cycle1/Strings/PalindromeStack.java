import java.util.*;
import java.util.Stack;
class PalindromeStack
{
public static void main(String[] args)
{
Scanner pss=new Scanner(System.in);
String str;
System.out.print("Enter a string: ");
str=pss.nextLine();
Stack stack= new Stack();
for(int i=0;i<str.length();i++)
{
stack.push(str.charAt(i));
}
String reverseString="";
while(!stack.isEmpty())
{
reverseString=reverseString+stack.pop();
}
if(str.equals(reverseString))
{
System.out.print(str+ "is a Palindrome string");
}
else
{
System.out.println(str+ "is not a Palindrome string");
}
}
}