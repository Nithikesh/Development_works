public class Bike
{
	static String bikebrand="FZS";
	static String bikemodel="2.0";
public static void main(String [] args)
{
System.out.println("BIKE BRAND- "+bikebrand);
System.out.println("BIKE MODEL- "+bikemodel);
	Bike thamizh = new Bike ();
int mile =thamizh.mileage();
	System.out.println("BIKE MILEAGE-"+ mile);
	
}
	public int mileage()
	{
		return 40;
	}
	
}
