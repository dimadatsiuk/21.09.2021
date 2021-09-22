import java.util.*;

public class Adressbuch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Adresse[] adressen = new Adresse[20];
        Adresse adr;
        boolean ready = false;

        for (int i = 0; i < adressen.length; i++) { 
            adressen[i] = new Adresse();
        }

        adr = adressen[0];





        System.out.println("================");
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

                    
                    System.out.print("\nName: " );
                    adr.name = scanner.next();

                    System.out.print("\nE-Mail: ");
                    adr.mail= scanner.next();

                    System.out.print("\nTelefonnummer: ");
                    adr.telefonnummer =  scanner.next();

                    System.out.print("\nStrasse: ");
                    adr.strasse = scanner.next();

                    System.out.print("\nHausnummer: ");
                    adr.hausnummer =  scanner.next(); 

                    System.out.print("\nPLZ: ");
                    adr.postleitzahl = scanner.next();

                    System.out.print("\nWohnort: ");
                    adr.wohnort = scanner.next();

                    System.out.print("\nKommentar: ");
                    adr.kommentar = scanner.next();

                    break;
                case 2:
                    System.out.print(adr.name + "\n" +
                                     adr.mail + "\n" + 
                                     adr.telefonnummer + "\n" +
                                     adr.strasse + ", " + adr.hausnummer + "\n" +
                                     adr.postleitzahl + ", " + adr.wohnort + "\n" +
                                     adr.kommentar);
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

    
}
