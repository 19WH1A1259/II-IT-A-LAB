import java.util.*;
import java.util.Queue;
import java.util.LinkedList;
class PalindromeQueue
{
public static void main(String[] args)
{
Scanner pss=new Scanner(System.in);
String str;
System.out.print("Enter a string: ");
str=pss.nextLine();
Queue queue = new LinkedList();
for(int i=str.length()-1;i>=0;i--)
{
queue.add(str.charAt(i));
}
String reverseString="";
while(!queue.isEmpty())
{
reverseString=reverseString + queue.remove();
}
if(str.equals(reverseString))
{
System.out.print(str+ " is a Palindrome string");
}
else
{
System.out.println(str+ " is not a Palindrome string");
}
}
}