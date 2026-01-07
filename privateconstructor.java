class privateconstructor
{
	private privateconstructor()
	{
		System.out.println("private constructor called");
	}
	public static void main(String[] args)
	{
		privateconstructor s=new privateconstructor();
		System.out.println("hello from class");
	}
}