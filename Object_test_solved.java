public class Object_test_solved {
int i=25;
static int j=50;
int f=75;
static int z=100;
public static void main (String [] args){
	Object_test_solved ot1 = new Object_test_solved();
ot1.i=100;
//i is public non-static variable, that needs to be called in main method - so object is needed
int j=200;
int x =(ot1.i+j);
//j is public static variable, so class name is needed to call in in the main method
System.out.println("x=" + x);
System.out.println("j=" + Object_test_solved.j);
//when declaring j as integer again in local, and adding preferred class name before j value, value of j is taken from that class
//when j is not declared as int, it is taking the value from local only even when adding class name before j
//When i renamed the file from Object_test to Object_test_solved, main class was affected, but object was not affected though it contains class name - Why??
int y =(ot1.f+z);
//f is public, non static variable. So, object is needed to call this in the main function
System.out.println("y=" + y);
int A=(x+y);
System.out.println("A=" + A);
int c= (x+y)/5;
int r= (A-ot1.f);
System.out.println("r="+r);
System.out.println("C=" + c);
int m= A*r*c;
System.out.println("m=" + m);
}
}