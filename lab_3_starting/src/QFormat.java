import java.util.Scanner;

/*

	QFormat.java -> L3-5

*/

public class QFormat
{
	// the following copied from Quadratic in JF 3

	public static void main(String[] args)
	{
		int a, b, c; // ax^2 + bx + c
		double discriminant, root1, root2;

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the coefficient of x squared: ");
		a = scan.nextInt();

		System.out.print("Enter the coefficient of x: ");
		b = scan.nextInt();

		System.out.print("Enter the constant: ");
		c = scan.nextInt();

		// Use the quadratic formula to compute the roots.
		// Assumes a positive discriminant.

		discriminant = Math.pow(b, 2) - (4 * a * c);
		root1 = ((-1 * b) + Math.sqrt(discriminant)) / (2 * a);
		root2 = ((-1 * b) - Math.sqrt(discriminant)) / (2 * a);

	}

}
