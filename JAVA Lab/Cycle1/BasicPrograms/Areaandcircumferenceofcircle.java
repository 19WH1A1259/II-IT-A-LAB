import java.util.*;
class Areaandcircumferenceofcircle
{
public static void main(String args[])
{
Scanner ac=new Scanner(System.in);
int r;
double area, circum;
System.out.print("Enter radius: ");
r=ac.nextInt();
area=3.14 * r * r;
circum=2 * 3.14 * r;
System.out.print("Area and Circumference of Circle:" +area +" and " + circum); 
}
}