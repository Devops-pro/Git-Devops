
import java.util.Scanner;
public class User_Input_Area
{
	public static void main (String[]args){
		User_Input_Area A = new User_Input_Area();
				A.Circle();
				A.Square();
				A.rectangle();
				A.triangle();}
	void Circle()
	{	
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the radius");
	int r=sc.nextInt();
double pi = 3.14;
Double Area= pi*r*r;
System.out.println("Area of Circle="+Area);}
void Square()
{
	Scanner sc=new Scanner (System.in);
	System.out.println("Enter side");
	int s=sc.nextInt();
	int square=s*s;
	System.out.println("Area of Square=" +square);
}
void rectangle()
{
	Scanner sc=new Scanner (System.in);
	System.out.println("Enter the Length");
	int l=sc.nextInt();
	System.out.println("Enter the Width");
	int w =sc.nextInt();
	int rectangle=l*w;
	System.out.println("Area of rectangle="+rectangle);}
	void triangle()
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the Breadth");
		int b=sc.nextInt();
		System.out.println("Enter the Height");
		int h=sc.nextInt();
		int triangle = (b*h)/2;
		System.out.println("Area of Triangle =" +triangle);
	}
}
