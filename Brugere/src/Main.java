import java.util.ArrayList;

public class Main {
        public static void main(String[] args) {


            User user1 = new User ("Jørgen", "123");
            User user2 = new User ("Peter", "2222", "Peter@jensen.dk", "12345678");

            ArrayList<User> userList = new ArrayList<>();
            userList.add(user1);
            userList.add(user2);


            for (User user : userList) {
                System.out.println(user);
            }



        }

}