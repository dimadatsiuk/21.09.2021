import java.util.Scanner;

public class delimiterTest {

    public static void main(String[] args) {
        
        
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


            /////////////////////////////////////////////////////////////////

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






             adr.name = outputInput("Name: ");
                    adr.alter = outputInput("Alter: ");
                    adr.mail = outputInput("E-Mail: ");
                    adr.telefonnummer = outputInput("Telefonnummer: ");
                    adr.strasse = outputInput("Strasse: ");
                    adr.hausnummer = outputInput("Hausnummer: ");
                    adr.postleitzahl = outputInput("PLZ: ");
                    adr.wohnort = outputInput("Wohnort: ");
                    adr.kommentar = outputInput("Kommentar: ");


        */


        Scanner sc = new Scanner(System.in);

        System.out.println("Geben Sie bitte Daten ein in folgender Reihenfolge, getrennt mit einem '/':" + 
                           "\nName / Alter /  E-Mail / Telefonnummer / Strasse / Hausnummer / PLZ / Wohnort / Kommentar");

        String userInput = sc.nextLine();


        Scanner scanner = new Scanner(userInput);
        scanner.useDelimiter("/");

        String name = scanner.next(),
               alter = scanner.next(),
               mail = scanner.next(),
               telefonnummer = scanner.next(),
               strasse = scanner.next(),
               hausnummer = scanner.next(),
               postleitzahl = scanner.next(),
               wohnort = scanner.next(),
               kommentar = scanner.next();


        System.out.println(name.trim()  + "\n" + alter.trim() + "\n" + mail.trim()  + "\n" + telefonnummer.trim()  + 
                           "\n" + strasse.trim()  + "\n" + hausnummer.trim() + "\n" + postleitzahl.trim()  + "\n" + wohnort.trim()  + "\n" +kommentar.trim() );








    }



    
}
