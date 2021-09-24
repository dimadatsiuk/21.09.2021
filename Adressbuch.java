import java.util.*;

public class Adressbuch {

    public static void main(String[] args) {

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
            String userChoice = outputInput("\n1 = Adresseingabe" + 
                                            "\n2 = Adressausgabe" +
                                            "\n3 = Aktuelle Adresse wechseln" +
                                            "\n4 = Programm beenden" +
                                            "\n\nIhre Wahl: ");

           

            switch (userChoice) {
                case "1":

                    adr.vorname = outputInput("Vorname: ");
                    adr.nachname = outputInput("Nachname: ");
                    adr.alter = outputInput("Alter: ");
                    adr.mail = outputInput("E-Mail: ");
                    adr.telefonnummer = outputInput("Telefonnummer: ");
                    adr.strasse = outputInput("Strasse: ");
                    adr.hausnummer = outputInput("Hausnummer: ");
                    adr.postleitzahl = outputInput("PLZ: ");
                    adr.wohnort = outputInput("Wohnort: ");
                    adr.kommentar = outputInput("Kommentar: ");

                    break;
                case "2":
                    System.out.print("\n====================\n" + 
                                     "Name: "+adr.vorname + " " + adr.nachname + "\n" +
                                     "Alter: "+castToInt(adr.alter) + "\n" +
                                     "E-Mail: "+adr.mail + "\n" + 
                                     "Telefonnummer: "+validatTel(adr.telefonnummer) + "\n" +
                                     "Anschrift:\n" +
                                     adr.strasse + ", " + validatHausNum(adr.hausnummer) + "\n" +
                                     validatPLZ(adr.postleitzahl) + ", " + adr.wohnort + "\n" +
                                     "Kommentar: "+adr.kommentar +
                                     "\n====================\n");
                    break;

                case "3":


                    int changeAdr = outputInputInt("Welche Adresse (0 bis 19)?");

                    if (changeAdr  >= 0 && changeAdr < adressen.length) { 
                        adr = adressen[changeAdr];
                    }  else { 
                        System.out.println("Eingabefehler!");
                    }
                    break;


                case "4":
                    ready = true;
                    break;
            
                default:
                    System.out.println("Eingabefehler!");
                    break;
            }
        }  
    }


    public static String outputInput (String inputLabel) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(inputLabel);
        String userInput =  scanner.next();
        if(!scanner.hasNext()) {
            scanner.close();
        } 
        return userInput;
    }

    public static int outputInputInt (String inputLabel) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(inputLabel);
        int userInput =  scanner.nextInt();
        if(!scanner.hasNextLine()) {
            scanner.close();
        } 
        return userInput;
    }

    


    public static String validatPLZ(String inputtedValue) {
        inputtedValue = inputtedValue.replaceAll("[^\\d]", "");
        return inputtedValue;
    }
    public static String validatTel(String inputtedValue) {
        inputtedValue = inputtedValue.replaceAll("[^\\d+]", "");
        return inputtedValue;
    }
    public static String validatHausNum(String inputtedValue) {
        inputtedValue = inputtedValue.replaceAll("[^A-Za-z0-9]", "");
        return inputtedValue;
    }




    public static int toInt (String userInput) {
        int newInt = Integer.parseInt(userInput);
        return newInt;
    }

    public static int castToInt(String inputtedValue) {
        inputtedValue = inputtedValue.replaceAll(",", ".");
        inputtedValue = inputtedValue.replaceAll("[^\\d.]", "");

        double d = Double.parseDouble(inputtedValue);
        int i = (int) d;

        return i;

    }

    
}
