class parameterConstructor
{
	String name;
	int id;
	 parameterConstructor(String name, int id)
	{
		this.name=name;
		this.id=id;
	}
	void display()
	{
		System.out.println("name: "+name+" and id:"+id);
	}
	public static void main(String[] args)
	{
		parameterConstructor ob=new parameterConstructor("yash",142);
		ob.display();
	}
}