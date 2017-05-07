
public class Manage_Vehicle {

	public static void main (String [] args){
	Two_Wheeler tw = new Two_Wheeler();
	System.out.println("This is Two wheeler cost" + " "+tw.getcost());
	System.out.println("This is Two wheeler speed" + " "+tw.getspeed());
	Three_Wheeler thw = new Three_Wheeler();
	System.out.println("This is Three wheeler cost" + " "+thw.getcost());
	System.out.println("This is Three wheeler speed" + " "+thw.getspeed());
	Four_Wheeler fw = new Four_Wheeler();
	System.out.println("This is Four wheeler cost" + " "+fw.getcost());
	System.out.println("This is Four wheeler speed" + " "+fw.getspeed());
}
}