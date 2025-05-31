import java.util.ArrayList;
import java.util.Scanner;

public class FlowerShop {

    public int total;
    public ArrayList <String> flowers;

    public FlowerShop(){

        flowers.add("Roser");
        flowers.add("Tulipaner");
        flowers.add("Liljer");
        flowers.add("Solsikke");
        flowers.add("Krysantemum");
        flowers.add("Anemoner");
        flowers.add("Lavendel");
        flowers.add("Orkidé");
        flowers.add("Hortensia");
        flowers.add("Sankt Hans Urt");
    }


    public void showFlowers(){

        System.out.println("Blomster:");
        for (int i = 0; i < flowers.size(); i++) {
            System.out.println((i + 1) + ". " + flowers.get(i));
        }

        System.out.println("Prisliste:");
        System.out.println("Blomst 1-4: 20kr");
        System.out.println("Blomst 5-7: 40kr");
        System.out.println("Blomst 8-10: 80kr");
        System.out.println("Buket (valgfrit): 50kr");
    }

    public void buyFlowers(int number, String flower){

        Scanner scanner = new Scanner(System.in);

        showFlowers();

        switch (flower){

                case "Roser" + "Tulipaner" + "Liljer" + "Solsikke" :
                total += 20;
                break;

                case "Krysantemum" +"Anemoner" + "Lavendel" :
                total += 40;
                break;

                case "Orkidé" + "Hortensia" + "Sankt Hans Urt" :
                total += 80;
                break;

                default:
                total += 0;
                break;

        }
    }

}
