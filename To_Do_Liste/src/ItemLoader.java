import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ItemLoader {


    public ArrayList<Item> loadFile (String path) {

        ArrayList<Item> items = new ArrayList<>();
        try {
            File file = new File(path);
            Scanner scanner = new Scanner(file);

            scanner.nextLine();

            while (scanner.hasNextLine()) {

                String line = scanner.nextLine();
                String[] parts = line.split(",");

                String description = parts[0];
                boolean isDone = Boolean.parseBoolean(parts[1]);

                items.add(new Item(description, isDone));
            }
        } catch (FileNotFoundException e) {

            System.out.println("file not found");
        }


        return items;
    }

}