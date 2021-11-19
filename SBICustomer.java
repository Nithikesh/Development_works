public class SBICustomer
{
public static void main(String [] args)
{
	Bank rep = new Bank();
	rep.deposit();
	rep.withdraw();
	System.out.println(rep.minBalance);
}
}