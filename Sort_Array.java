import java.util.Arrays;
public class Sort_Array {
	public static void main (String args[]){
	int x[]= {12,115,67,99,90,82};
	System.out.println("Before Array Sort");
	System.out.println(Arrays.toString(x));
	Arrays.sort(x);
	System.out.println("After Array Sort");
	System.out.println(Arrays.toString(x));
	//System.out.println(x);
}
}