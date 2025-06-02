import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class StringHandler {


    public ArrayList<String> replaceText(String path, ArrayList<String> names) {

        ArrayList<String> anonymizedLines;

        try {
            File file = new File(path);
            Scanner scanner = new Scanner(file);
            anonymizedLines = new ArrayList<>();


            while (scanner.hasNextLine()) {


                String originalLine = scanner.nextLine();

                for (String name : names) {

                    originalLine = originalLine.replace(name, "Den Studerende");

                }
                anonymizedLines.add(originalLine);

            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        return anonymizedLines;

    }
}