import java.util.ArrayList;
import java.util.Scanner;

public class FlowerShop {

    public ArrayList<String> flowers;
    public double total;


    public FlowerShop() {

        this.flowers = new ArrayList<>();
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


    }

    public void showFlowerOptions() {

        for (int i = 0; i < flowers.size(); i++) {

            System.out.println(i + 1 + ". " + flowers.get(i));

        }
    }

    public void runDialog() {
        Scanner scanner = new Scanner(System.in);
        showFlowerOptions();

        for (int i = 1; i <= 3; i++) {
            System.out.print("Vælg blomst:" + i + " (indtast tal fra 1 til 10): ");
            int choice = scanner.nextInt();

            if (choice >= 1 && choice <= 4) {
                total += 20;
            } else if (choice >= 5 && choice <= 7) {
                total += 40;
            } else if (choice >= 8 && choice <= 10) {
                total += 80;
            } else {
                System.out.println("Ugyldigt valg. Prøv igen.");
                i--;
            }
        }

        System.out.print("Vil du have blomsterne bundet i en buket? (ja/nej): ");
        scanner.nextLine();
        String answer = scanner.nextLine().toLowerCase();

        if (answer.equals("ja")) {
            total += 50;
        }

        System.out.println("Den samlede pris er: " + total + " kr.");
    }
}