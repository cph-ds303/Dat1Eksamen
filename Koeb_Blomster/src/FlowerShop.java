import java.util.ArrayList;
import java.util.Scanner;

public class FlowerShop {

    private int total;
    private ArrayList<String> flowers;

    public FlowerShop() {
        flowers = new ArrayList<>();
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

    public void showFlowers() {
        System.out.println("Blomster:");
        for (int i = 0; i < flowers.size(); i++) {
            System.out.println((i + 1) + ". " + flowers.get(i));
        }

        System.out.println("\nPrisliste:");
        System.out.println("Blomst 1-4: 20kr");
        System.out.println("Blomst 5-7: 40kr");
        System.out.println("Blomst 8-10: 80kr");
        System.out.println("Buket (valgfrit): 50kr");
    }

    private void addFlowerPrice(int index) {
        if (index >= 1 && index <= 4) {
            total += 20;
        } else if (index >= 5 && index <= 7) {
            total += 40;
        } else if (index >= 8 && index <= 10) {
            total += 80;
        } else {
            System.out.println("Ugyldigt valg.");
        }
    }

    public void runDialog() {
        Scanner scanner = new Scanner(System.in);
        showFlowers();

        for (int i = 1; i <= 3; i++) {
            System.out.print("\nVælg blomst nr. " + i + " (1-10): ");
            int choice = scanner.nextInt();
            if (choice >= 1 && choice <= 10) {
                addFlowerPrice(choice);
            } else {
                System.out.println("Ugyldigt valg. Prøv igen.");
                i--; // prøv igen
            }
        }

        System.out.print("\nVil du have blomsterne bundet til en buket? (ja/nej): ");
        String bundle = scanner.next();
        if (bundle.equalsIgnoreCase("ja")) {
            total += 50;
        }

        System.out.println("\nDin samlede pris er: " + total + " kr.");
    }

}