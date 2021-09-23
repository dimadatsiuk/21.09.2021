import java.util.*;

public class Adressbuch {

    

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        /* 

            // Initialize Scanner object
            Scanner scan = new Scanner("Anna Mills/Female/18");
            // initialize the string delimiter
            scan.useDelimiter("/");
            // Printing the tokenized Strings
            while(scan.hasNext()){
                System.out.println(scan.next());
            }
            // closing the scanner stream
            scan.close();




            String input = "1 fish 2 fish red fish blue fish";

            // \\s* means 0 or more repetitions of any whitespace character 
            // fish is the pattern to find
            Scanner s = new Scanner(input).useDelimiter("\\s*fish\\s*");

            System.out.println(s.nextInt());   // prints: 1
            System.out.println(s.nextInt());   // prints: 2
            System.out.println(s.next());      // prints: red
            System.out.println(s.next());      // prints: blue

            // don't forget to close the scanner!!
            s.close(); 
        
        
        
        
        
        
        */






        //Scanner scanner = new Scanner("");

        Adresse[] adressen = new Adresse[20];
        Adresse adr;
        boolean ready = false;

        for (int i = 0; i < adressen.length; i++) { 
            adressen[i] = new Adresse();
        }

        adr = adressen[0];


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

                    Scanner sc = new Scanner(System.in);

                    System.out.println("Geben Sie bitte Daten ein in folgender Reihenfolge, getrennt mit einem '/':" + 
                                    "\nName / Alter /  E-Mail / Telefonnummer / Strasse / Hausnummer / PLZ / Wohnort / Kommentar");
                                    
                    String userInput = sc.nextLine();


                    Scanner scan = new Scanner(userInput);
                    scan.useDelimiter("/");

                    adr.name = scanner.next();
                    adr.alter = scanner.next();
                    adr.mail = scanner.next();
                    adr.telefonnummer = scanner.next();
                    adr.strasse = scanner.next();
                    adr.hausnummer = scanner.next();
                    adr.postleitzahl = scanner.next();
                    adr.wohnort = scanner.next();
                    adr.kommentar = scanner.next();


                    break;
                case 2:
                    System.out.print("\n====================\n" + 
                    
                                     "Name: "+adr.name + "\n" +
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




    /* public static String outputInput (String a) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(a);
        String b =  scanner.nextLine();
        return b;
    } */

    


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
