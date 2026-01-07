class strictfloatingp{
    public strictfp double sum()
	{
        double num1=10e+10;
		double num2=6e+10;
		return(num1+num2);
    }
	public static void main(String[] args)
	{
		strictfloatingp t=new strictfloatingp();
		System.out.println(sum());
	}
}
