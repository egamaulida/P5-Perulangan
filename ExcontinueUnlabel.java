public class exContinueUnlabel {

    public static void main(string [] args) {
        string names[] = {"Beah", "Bianca", "lance", "Beah"};
        int count =0;
        for (int i+0; i<names .length; i++) {
            if ( !names[i].equals("Beah") ){
                continue;//skip next statement
            }
            count++;
        }
        system.out.printIn("There are " + count + " Beahs in the list");
        ;

;