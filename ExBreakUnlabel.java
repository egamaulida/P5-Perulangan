public class ExBreaklabel {

    public static void main(string [] args) {
        string names [] = { "Beah", "Bianca", "Lance", "Belle", "Nico", "Yza", "Gem", "Fthan"};
        String searchName = "Yza";
        boolean foundName = false;
        for( int i=0; i< names.lenght; i++) {
            if ( names[i].equals( searchName )){
                foundname = true;
                break;
            }

        }
        if (foundname ) {
            system.out.printIn(searchname + " Found!" );
        }else{
            system.out.prinIn(Searchname + "Not found." );
        }

        }

    }