// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    // Variable initialization:
		int seed = Integer.parseInt(args[0]);
		String mode = args[1];
		boolean verbose = mode.equals("v");
		// int i = seed;
		
		for(int j = 1; j<= seed;j++){
			int counter = 0;
			int i = j;
			do {
				if (i % 2 == 0) {
					if (verbose) 
						System.out.print(i + " ");
					i = i / 2;
				}
				else{
					if (verbose) 
					System.out.print(i + " ");
				i = i * 3 + 1;
				}
				counter = counter + 1;
			}
			while (i != 1); {
				if (i % 2 == 0) {
					if (verbose) 
						System.out.print(i + " ");
					i = i / 2;
				}
				else{
					if (verbose)
						System.out.print(i + " ");
					i = i * 3 + 1;
				}
				counter = counter + 1;
			}
			if (verbose) {
				System.out.print("(" + counter + ")");
				System.out.println("");
			}
		}
		System.out.println("Every one of the first "+ seed + " hailstone sequences reached 1.");
	}
}
