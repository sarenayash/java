class Main 
{
	int length;
	int breadth;
	void getdata()
	{
		int a=length*breadth;
		System.out.println("area "+a);
	}
}
class encapsulation
{
	public static void main(String[] args)
	{
		Main obj=new Main();
		obj.length=5;
		obj.breadth=6;
		obj.getdata();
	}
}