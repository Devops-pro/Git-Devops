
public class Datatype {
int i=5;
static int j=10;
public static void main (String [] args){
	Datatype D1= new Datatype();
int j=15;
D1.i=85;
System.out.println("j=" +j);
//preference for local variable
System.out.println("i=" + D1.i);
//i value is taken from object.i since i is referred to the object
System.out.println("j=" + Datatype.j);
//j value is now taken from public since class name - Datatype is used
//since i is related to object, it is instance variable
//when a program is compiled, class is loaded, once a class is loaded, memory is allocated
//every time object is created, memory is allocated
}
}
