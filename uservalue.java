import java.util.Scanner;
class uservalue{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter name:");
		String s=scn.nextLine();
		System.out.println("enter rollnumber:");
		int i=scn.nextInt();
		System.out.println("your name is:"+s);
		System.out.println("your rollnumber is:"+i);
		
	}
}