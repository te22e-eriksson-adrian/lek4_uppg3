import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Skriva in text.
        Scanner tangentbord = new Scanner(System.in);
        System.out.println("Instruktioner:");
        System.out.println("Du ska nu fylla i dina uppgifter på följande sätt, skriv ditt förnamn, efternamn, din längd och din ålder på samma rad efter varandra med endast mellanslag mellan varandra.");
        System.out.println("    ");
        System.out.print("Fyll i dina uppgifter här: ");
        String text = tangentbord.nextLine();

        //Organisering av information
        System.out.println("    ");
        int mellan1_index = text.indexOf(" ");
        System.out.println("1:a mellanslagets teckenposition: "+mellan1_index);
        int mellan2_index = text.indexOf(" ",mellan1_index+1);
        System.out.println("2:a mellanslagets teckenposition: "+mellan2_index);
        int mellan3_index = text.indexOf(" ",mellan2_index+1);
        System.out.println("3:e mellanslagets teckenposition: "+mellan3_index);
        //int mellan4_index = text.indexOf(" ", mellan3_index+1);
        //System.out.println("4:e mellanslagets teckenposition: "+mellan4_index);
        String förnamn = text.substring(0,mellan1_index);
        System.out.println("Förnamn: "+förnamn);
        String Efternamn = text.substring(mellan1_index, mellan2_index);
        System.out.println("Efternamn:"+Efternamn);
        //double längd = text.substring(mellan3_index, mellan4_index);
        tangentbord.close();
    }
}