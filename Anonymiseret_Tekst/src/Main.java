import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            String text = Files.readString(Path.of("data/students.txt"));

            List<String> names = Arrays.asList("Anders", "Katrine", "Joakim", "Stine");

            StringHandler handler = new StringHandler();

            String anonymizedText = handler.replaceText(text, names);
            System.out.println("Original tekst:");
            System.out.println(text);
            System.out.println("\nAnonymiseret tekst:");
            System.out.println(anonymizedText);

        } catch (IOException e) {
            System.out.println("Fejl ved læsning af fil: " + e.getMessage());
        }
    }
}