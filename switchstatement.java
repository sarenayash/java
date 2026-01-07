
class switchstatement 
{
    public static void main(String[] args) 
	{
        String day = "wed";
        switch (day) {
            case "mon":
                System.out.println("mon");
                break;

            case "tue":
                System.out.println("tue");
                break;

            case "wed":
                System.out.println("wed");
                break;

            case "thur":
                System.out.println("thur");
                break;

            case "fri":
                System.out.println("fri");
                break;

            case "sat":
                System.out.println("sat");
                break;

            default:
                System.out.println("cannot find");
        }
    }
}
