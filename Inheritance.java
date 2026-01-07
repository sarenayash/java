class car
{
	String name;
	public void speed()
	{
		System.out.println(name);
	}
}
class alto extends car
{
	public void display()
	{
		System.out.println("this is a alto class");
	}
}
class Inheritance
{
	public static void main(String[] args)
	{
		alto a=new alto();
		a.name="fortuner";
		a.display();
		a.speed();
	}
}