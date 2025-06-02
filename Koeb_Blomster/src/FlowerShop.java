import java.util.ArrayList;
import java.util.Scanner;

public class FlowerShop {

    public ArrayList<String> flowers;
    public double total;


    public FlowerShop() {
        ArrayList<String> flowers = new ArrayList<>();
        flowers.add("Roser" + " 20kr");
        flowers.add("Tulipaner" + " 20kr");
        flowers.add("Liljer" + " 20kr");
        flowers.add("Solsikke" + " 20kr");
        flowers.add("Krysantemum" + " 40kr");
        flowers.add("Anemoner" + " 40kr");
        flowers.add("Lavendel" + " 40kr");
        flowers.add("Orkidé" + " 80kr");
        flowers.add("Hortensia" + " 80kr");
        flowers.add("Sankt Hans Urt" + " 80kr");

        this.flowers = flowers;

    }

    public void showFlowerOptions() {

        for (int i = 0; i < flowers.size(); i++) {

            System.out.println(i + 1 + ". " + flowers.get(i));

        }
    }

    public void runDialog(){

        Scanner scanner = new Scanner(System.in);
        showFlowerOptions();




    }

}