import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {


        ArrayList<String> names = new ArrayList<>();
        names.add("Katrine");
        names.add("Stine");
        names.add("Joakim");
        names.add("Anders");


        StringHandler sh = new StringHandler();
        ArrayList<String> processedText = sh.replaceText("data/students.txt",  names);


        for (String text : processedText){

            System.out.println(text);
        }
    }

}