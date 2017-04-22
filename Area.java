
public class Area {
	//Without RETURN without Argument
	void AS(){
		int a=5;
	 int AS=a*a;
	 System.out.println("AS="+AS);
		}
	//Without RETURN with Argument
	void AT(int b, int h){
		int AT= (b*h)/2;
				 System.out.println("AT="+AT);
	}
	//With RETURN without Argument
	double AC(){
		int r=5;
		double AC=(3.14*r*r);
		return AC;
	}
	//With RETURN with Argument
		int AR(int l,int b) {
		int AR= l*b;
			return AR;	
		}
	public static void main(String[]args){
		Area A = new Area();
		A.AS();
		A.AT(6, 5);
		int AR=A.AR(8, 9);
		double AC=A.AC();
System.out.println("AR=" + AR);
System.out.println("AC=" + AC);
}
}