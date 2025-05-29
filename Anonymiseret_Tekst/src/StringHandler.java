import java.util.List;

public class StringHandler {


    public String replaceText(String originalText, List<String> names) {
        String result = originalText;
        for (String name : names) {
            result = result.replaceAll(name, "Den studerende");
        }
        return result;
    }
}