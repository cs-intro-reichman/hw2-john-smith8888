public class TimeCalc {
    public static void main(String[] args) {
        
        // Shamelessly copied argument intake from previous assignment
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int mintoadd = Integer.parseInt(args[1]);
        // System.out.println("Hours: " + hours + " Minutes: " + minutes + " minutes to add: " + mintoadd);

        //calculation:
        int totalminutes = hours*60 + minutes + mintoadd;
        int nuhours = totalminutes / 60;
        int numins = totalminutes - nuhours*60;
        nuhours = nuhours % 24 ;

        // System.out.println("New Hours: " + nuhours + " Minutes: " + numins);

        // time display: basically adding zeros to hours and / or minutes under 10

        String sMinutes = "" + numins;
        if (numins < 10) {
			sMinutes = "0" + numins;
		}

        String sHours = "" + nuhours;
        if (nuhours < 10) {
			sHours = "0" + nuhours;
		}

        System.out.println(sHours + ":"+sMinutes);
    }
}
