public class Library
{
static String libraryname ="Anna library";
static int address =47;
static String address1 = ",nethaji street,ganthi road,vellore-";
	static int address2 =632055;
	String bookname ;
	String author;
	int pages;
	public Library(String s1,String s2,int i)
	{
		/*bookname=s1;
		author=s2;
		pages=i;*/
	}
public static void main (String [] args)
{
	System.out.println(libraryname);
	System.out.println(address + address1 + address2);
	System.out.println("               ");
	Library book1=new Library("Lost in space","Kevin emerson",126);
	Library book2=new Library("Vekkai","Poomani",99);
	Library book3=new Library("India dark","Kristy murrary",307);
	/*book1.bookname="Lost in space";
	book2.bookname="Vekkai";
	book3.bookname="India dark";
	book1.author="Kevin emerson";
	book2.author="Poomani";
	book3.author="Kristy murrary";
	book1.pages=126;
	book2.pages=99;
	book3.pages=307;*/
	book1.lend();
	book2.lend();
	book3.lend();
}
	public void lend ()
	{
		System.out.println("BOOK NAME   -"+ bookname);
		System.out.println("AUTHOR      -"+ author);
		System.out.println("TOTAL PAGES -"+ pages);
		System.out.println("                ");
	}
}

		
	
	
	

	
	
	
	