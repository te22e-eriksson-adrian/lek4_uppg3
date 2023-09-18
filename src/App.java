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
        String förnamn = text.substring(0,mellan1_index);
        System.out.println("Förnamn: "+förnamn);
        tangentbord.close();
    }
}