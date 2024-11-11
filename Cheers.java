// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    String chant = args[0];
            chant = chant.toUpperCase();
            int count = Integer.parseInt(args[1]);
            System.out.println(chant + " count: " + count);
            int i = 0;
            while (i<chant.length()) {
                if (chant.charAt(i)=='A'||
                    chant.charAt(i)=='E'||
                    chant.charAt(i)=='F'||
                    chant.charAt(i)=='H'||
                    chant.charAt(i)=='I'||
                    chant.charAt(i)=='L'||
                    chant.charAt(i)=='M'||
                    chant.charAt(i)=='N'||
                    chant.charAt(i)=='O'||
                    chant.charAt(i)=='R'||
                    chant.charAt(i)=='S'||
                    chant.charAt(i)=='X') {
                        System.out.println("Give me an " + chant.charAt(i) + ": " + chant.charAt(i));
                }
                else
                        System.out.println("Give me a " + chant.charAt(i) + ": " + chant.charAt(i));
                i = i+1;
            }
            System.out.println("What does that spell?");
            i = 0;
            while (i < count) {
                System.out.println(chant + "!!!");
                i = i + 1;
            }
        }
}
