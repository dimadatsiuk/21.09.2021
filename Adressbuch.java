import java.util.*;

public class Adressbuch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Scanner scanner = new Scanner("");

        Adresse[] adressen = new Adresse[20];
        Adresse adr;
        boolean ready = false;

        for (int i = 0; i < adressen.length; i++) { 
            adressen[i] = new Adresse();
        }

        adr = adressen[0];


        //test


        /* String hi = "Hello+=1!@#432*&^";

        System.out.println("\nvalidation test\n"+
                           "\nInitial string: " + hi + 
                           "\n1. "+validatHausNum(hi) +
                           "\n2. "+validatTel(hi) +
                           "\n3. "+validatPLZ(hi)
        ); */

        




        System.out.println("\n================");
        System.out.println("Adressverwaltung");
        System.out.println("================");       


        // Schleifenbeginn
        while (!ready) {

            // Menue
            System.out.println("\n1 = Adresseingabe" + 
                               "\n2 = Adressausgabe" +
                               "\n3 = Aktuelle Adresse wechseln" +
                               "\n4 = Programm beenden" +
                               "\n\nIhre Wahl: ");

            int userChoice = scanner.nextInt();

            switch (userChoice) {
                case 1:

                    adr.name = outputInput("Name: ");
                    adr.alter = outputInput("Alter: ");
                    adr.mail = outputInput("E-Mail: ");
                    adr.telefonnummer = outputInput("Telefonnummer: ");
                    adr.strasse = outputInput("Strasse: ");
                    adr.hausnummer = outputInput("Hausnummer: ");
                    adr.postleitzahl = outputInput("PLZ: ");
                    adr.wohnort = outputInput("Wohnort: ");
                    adr.kommentar = outputInput("Kommentar: ");

                    break;
                case 2:
                    System.out.print("\n====================\n" + 
                                     "Name: "+adr.name + "\n" +

                                     ////////////////////////////////////////
                                     /* "Alter: " + Integer.parseInt(adr.alter) + "\n" +
                                     "Alter: " + Integer.valueOf(adr.alter) + "\n" + */
                                     ////////////////////////////////////////

                                     "Alter: "+castToInt(adr.alter) + "\n" +


                                     "E-Mail: "+adr.mail + "\n" + 
                                     "Telefonnummer: "+validatTel(adr.telefonnummer) + "\n" +
                                     "Anschrift:\n" +
                                     adr.strasse + ", " + validatHausNum(adr.hausnummer) + "\n" +
                                     validatPLZ(adr.postleitzahl) + ", " + adr.wohnort + "\n" +
                                     "Kommentar: "+adr.kommentar +
                                     "\n====================\n");
                    break;

                case 3:

                    System.out.println("Welche Adresse (0 bis 19)?");
                    int changeAdr = scanner.nextInt();

                    if (changeAdr  >= 0 && changeAdr < adressen.length) { 
                        adr = adressen[changeAdr];
                    }  else { 
                        System.out.println("Eingabefehler!");
                    }
                    break;


                case 4:
                    ready = true;
                    break;
            
                default:
                    System.out.println("Eingabefehler!");
                    break;
            }

        }
        scanner.close();

        
    }


    public static String outputInput (String a) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(a);
        String b =  scanner.nextLine();
        return b;
    }

    


    public static String validatPLZ(String a) {
        a = a.replaceAll("[^\\d]", "");
        return a;
    }
    public static String validatTel(String a) {
        a = a.replaceAll("[^\\d+]", "");
        return a;
    }
    public static String validatHausNum(String a) {
        a = a.replaceAll("[^A-Za-z0-9]", "");
        return a;
    }

    public static int castToInt(String a) {

        a = a.replaceAll(",", ".");
        a = a.replaceAll("[^\\d.]", "");

        double d = Double.parseDouble(a);
        int i = (int) d;

        return i;

    }

    
}
