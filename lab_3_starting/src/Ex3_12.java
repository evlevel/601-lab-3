
/**
 * Lab 3, problem 7
 * 
 */

public class Ex3_12
{
	enum Days {Sunday, Manday, Tuesday, Wednesday, Thursday,
        Friday, Saturday}
	
	public static void main(String[] args)
	{
		Days day1, day2, day3;

        day1 = Days.Sunday;
        day2 = Days.Friday;

        System.out.println("day1 value: " + day1);
        System.out.println("day1 ordinal: " + day1.ordinal());
        System.out.println("day1 name: " + day1.name());

        System.out.println();
        System.out.println("day2 value: " + day2);
        System.out.println("day2 ordinal: " + day2.ordinal());
        System.out.println("day2 name: " + day2.name());

        day3 = day1;

        System.out.println();
        System.out.println("day3 value: " + day3);
        System.out.println("day3 ordinal: " + day3.ordinal());
        System.out.println("day3 name: " + day3.name());

	}

}
