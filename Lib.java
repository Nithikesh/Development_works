public class Lib
{
//static String libname="anbu";
//static String  adreess= ",masilamani nagar,theni";
String bookname;
String author;
int pages;

public Lib(String s1,String s2,int i)
{
	 bookname=s1;
		author=s2;
		pages=i;

}
public static void main (String []args)
{
Lib book1=new Lib("Lost in space","Kevin emerson",126);
	Lib book2=new Lib("Vekkai","Poomani",99);
	Lib book3=new Lib("India dark","Kristy murrary",307);
	
	book1.lend();
	book2.lend();
	book3.lend();
}



public void lend ()
{
		System.out.println("BOOK NAME   -"+ bookname);
		System.out.println("AUTHOR      -"+ author);
		System.out.println("TOTAL PAGES -"+ pages);
		
}
}