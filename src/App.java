import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Skriva in text.
        Scanner tangentbord = new Scanner(System.in);
        System.out.println("Instruktioner:");
        System.out.println("Du ska nu fylla i dina uppgifter på följande sätt, skriv ditt förnamn, efternamn, din längd och din ålder på samma rad efter varandra med endast mellanslag mellan varandra. Avsluta med ett till mellanslag innnan du trycker på ENTER.");
        System.out.println("    ");
        System.out.print("Fyll i dina uppgifter här: ");
        String text = tangentbord.nextLine();

        //Ta reda på mellanslagens plats
        System.out.println("    ");
        int mellan1_index = text.indexOf(" ");
        System.out.println("1:a mellanslagets teckenposition: "+mellan1_index);
        int mellan2_index = text.indexOf(" ",mellan1_index+1);
        System.out.println("2:a mellanslagets teckenposition: "+mellan2_index);
        int mellan3_index = text.indexOf(" ",mellan2_index+1);
        System.out.println("3:e mellanslagets teckenposition: "+mellan3_index);
        int mellan4_index = text.indexOf(" ", mellan3_index+1);
        System.out.println("4:e mellanslagets teckenposition: "+mellan4_index);

        //Organisera information från texten
        System.out.println("    ");
        String förnamn = text.substring(0,mellan1_index);
        System.out.println("Förnamn: "+förnamn);
        String Efternamn = text.substring(mellan1_index, mellan2_index);
        System.out.println("Efternamn:"+Efternamn);
        String decimal_text = text.substring(mellan2_index, mellan3_index);
        double längd = Double.parseDouble(decimal_text);
        System.out.println("Längd:"+längd);
        String siffra_text = text.substring(mellan3_index+1, mellan4_index);
        int ålder = Integer.parseInt(siffra_text);
        System.out.println("Ålder:"+ålder);
        tangentbord.close();

        //Räkna ut när någon fyller jämt nästa gång
        /* System.out.println("    ");
        int rest = ålder%10;
        int årkvar= 10-rest;
        System.out.println("Om "+årkvar+" år så är din ålder jämn"); */
    }
}