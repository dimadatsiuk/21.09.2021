

public class test {

    public static void main(String[] args) {
        

        String coloursString = "Blue, Red, Yellow, Orange, Lila";
        String[] colours = coloursString.split(", ");


        for (String colour : colours) {
            System.out.println(colour); 
        }



       /*  for (int i = 0; i < colours.length; i++) {
            System.out.print(colours[i]);
        } */



    }
    
}
