public class Banks
{
public static void main (String[]args)
{
Banks manager=new Banks();
double balance = manager.calculateInterest(100000);
System.out.println(balance);//()argument
balance = manager.calculateInterest(100000,5);
System.out.println(balance);
balance = manager.calculateInterest(1000,12,6.5f);
System.out.println(balance);
	manager.calculateInterest(1000,12,6);
	String customer = manager.calculateInterest(100000,"Nithikesh");
	System.out.println(customer);
}
public String calculateInterest(int amt, String name)
{
	return name;
}
public double calculateInterest(int p,int n,float r)//()parameter
{
return p*n*(r/100);
}
public double calculateInterest(int amount,int year)//()parameter
{
float interest=4.5f;
double value = amount*4.5/100* year;
return value;
}
public double calculateInterest(int amount)//()parameter
{
float interest=4.5f;
double value = amount*4.5/100;
return value;
}
}