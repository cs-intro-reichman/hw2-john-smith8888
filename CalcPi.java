// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
		// variable initialization
		int n = Integer.parseInt(args[0]);
	    double benchmarkPI = Math.PI;
		double calcPi = 0.0 ;
		int i = 1;

		while (i <= n) {
			if (i % 2 ==0) {
				calcPi = calcPi - (1/(2*(double)i - 1));
			}
			else
			{
				calcPi = calcPi + (1/(2*(double)i - 1));
			}
			i = i + 1;
		}
		calcPi = calcPi*4;
		System.out.println("pi according to Java: " + benchmarkPI);
		System.out.println("pi, approximated:     " + calcPi);
	}
}
