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

        String hi = "Hello+=1!@#432*&^";
        System.out.println(validation(hi));

        




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

                    adr.name = outputInput("Name: ");
                    adr.mail = outputInput("E-Mail: ");
                    adr.telefonnummer = outputInput("Telefonnummer: ");
                    adr.strasse = outputInput("Strasse: ");
                    adr.hausnummer = outputInput("Hausnummer: ");
                    adr.postleitzahl = outputInput("PLZ: ");
                    adr.wohnort = outputInput("Wohnort: ");
                    adr.kommentar = outputInput("Kommentar: ");

                    break;
                case 2:
                    System.out.print(adr.name + "\n" +
                                     adr.mail + "\n" + 
                                     validation(adr.telefonnummer) + "\n" +
                                     adr.strasse + ", " + validation(adr.hausnummer) + "\n" +
                                     validation(adr.postleitzahl) + ", " + adr.wohnort + "\n" +
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


    public static String outputInput (String a) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(a);
        String b =  scanner.nextLine();
        //scanner.close();
        return b;
    }

    public static String validation(String a) {

        a = a.replaceAll("[^A-Za-z0-9+]", "");

        return a;

    }

    
}
