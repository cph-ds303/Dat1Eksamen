import java.util.ArrayList;

public class TodoList {

    public ArrayList<Item> items;

    public TodoList (ArrayList<Item> items) {

        this.items = items;
    }

    public void displayItems (){

        for (int i = 0; i < items.size(); i++){

            Item item = items.get(i);


            System.out.println(i + 1 + " " + item.description + " " + item.isDone);

        }

    }

}
