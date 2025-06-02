
    public class Item {


    public String description;
    public boolean isDone;


    public Item (String description, boolean isDone) {

        this.description = description;
        this.isDone = isDone;
    }

    public void markAsDone (){

        isDone = true;
    }

    public void markAsUndone (){
        isDone = false;
    }
    }