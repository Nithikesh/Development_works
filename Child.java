class Child extends Parent
{
public Child()
{
this(555);
System.out.println("Child Class Constructor");
}
public Child(int i)
	{
	super(i);//super class object new parent()
		System.out.println("Single Child ");
	}

public static void main (String [] args)
{
Child ch = new Child();
Child ch2 = new Child(5);

}

}