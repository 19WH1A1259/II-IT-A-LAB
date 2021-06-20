import java.util.*;
class VowelConsonantcount
{
public static void main(String args[])
{
Scanner vc=new Scanner(System.in);
System.out.print("Enter a String: ");
char a[]=vc.next().toCharArray();
int v=0, c=0, i;
for(i=0;i<a.length;i++)
{
if(a[i] == 'A' || a[i] == 'E' || a[i] == 'I' ||a[i] == 'O' ||a[i] == 'U' || a[i] == 'a' || a[i] == 'e' || a[i] == 'i' || a[i] == 'o' || a[i] == 'u')
{
v++;
}
else
{
c++;
}
}
System.out.println("VowelCount: "+v);
System.out.println("ConsonantCount: "+c);
}
}