class son
{
	void role()
	{
		System.out.println("base class");
	}
}
class father extends son
{
	void role()
	{
		System.out.println("derived class");
	}
}
public class polymorphism {
    public static void main(String[] args)
	{
        son p = new father(); // runtime polymorphism
        p.role();
    }
}
