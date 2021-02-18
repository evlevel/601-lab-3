/*
 
  Trig.java -> L3-8
 
 */

public class Trig
{

	public static void main(String[] args)
	{
		StdOut.print("Enter x: ");
		double x = StdIn.readDouble();
		
		StdOut.print("Enter y: ");
		double y = StdIn.readDouble();
		
		StdOut.printf("The formula is sin(%f + %f) = sin(%f)*cos(%f)+cos(%f)*sin(%f)\n",
				x, y, x, y, x, y);
		
	
		StdOut.printf("The left side is: %f\n", Math.sin(x+y));
		

		StdOut.printf("The right side is: %f\n", Math.sin(x)*Math.cos(y) + (Math.cos(x)*Math.sin(x)));
		
		StdOut.println(); //for spacing purpose
		
		// do the remaining two...
		
	}

}
