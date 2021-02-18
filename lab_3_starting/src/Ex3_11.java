/*
 
  Ex3_11.java -> L3-6
 
 */


public class Ex3_11
{

	public static void main(String[] args)
	{
	
		StdOut.print ("Enter a doubleL: ");
		
		double dValue;
		
		dValue = StdIn.readDouble();
		
		StdOut.printf ("You entered %3.3f.\n", dValue);
		
		double answer1 = dValue*dValue*dValue*dValue;
		StdOut.printf("%3.3f\n",answer1);
		
		double answer2 = Math.pow(dValue, 4.0);
		StdOut.printf("%3.15f\n", answer2);
		
		
		
	}

}
