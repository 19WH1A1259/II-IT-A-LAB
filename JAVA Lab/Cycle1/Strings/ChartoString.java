import java.util.*; 
class ChartoString
{
public static void main(String args[])
{
Scanner a=new Scanner(System.in);
char ch=a.next().charAt(0);
String s=Character.toString(ch);
System.out.print("String: " +s);
}
}