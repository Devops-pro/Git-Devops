import java.lang.*;
import java.util.Scanner;
public class Studentnew {
int rollno;
String name;
String pwd;
String email;
void getinfo()
{
	Scanner sc= new Scanner (System.in);
	System.out.println("Enter the roll no: ");
	rollno = sc.nextInt();
	System.out.println("Enter the name: ");
	name = sc.next();
	System.out.println("Enter the pwd: ");
	pwd = sc.next();
	System.out.println("Enter the email: ");
	email = sc.next();
}
void displayinfo(){
System.out.println("The roll no is" +rollno);
System.out.println("The roll name is" +name);
System.out.println("The roll pwd is" +pwd);
System.out.println("The roll email is" +email);
}
public static void main (String [] args){
{
Studentnew r1 = new Studentnew ();
//r1.getinfo();
//r1.displayinfo();
for (int i=0; i<=2; i++)
{
	r1.getinfo();
}
for (int i=0;i<=2;i++)
	r1.displayinfo();	
}}}
