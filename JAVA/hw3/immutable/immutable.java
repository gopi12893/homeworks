package immutable;

public class immutable {

	public static void main(String[] args)
	{
		
Time clock = new Time(5,35);
Time clock2 = clock.newTime(9);
System.out.println(clock.toString());
System.out.println(clock2.toString());
	}

}
