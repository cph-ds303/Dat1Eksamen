import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

    ItemLoader loader = new ItemLoader();
        ArrayList<Item> itemList = loader.loadFile("data/todo.csv");

        TodoList todo = new TodoList(itemList);


        todo.displayItems();


    }
}