import java.util.*;
import java.lang.*;
class Palindrome
{
	public static void main (String []args){
		String S1;
		String S2 ="";
			Scanner Sc = new Scanner(System.in);
			System.out.println("Enter the String: ");
			S1=Sc.next();
			for (int i=S1.length()-1;i>=0;i--){
				S2=S2+S1.charAt(i);
			}
			if (S1==S2)
			System.out.println("This is a Palindrome");
			else
				System.out.println("This is not a Palindrome");
	}
}
