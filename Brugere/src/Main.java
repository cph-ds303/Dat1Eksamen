import java.util.ArrayList;
import java.util.Collections;

public class Main {
        public static void main(String[] args) {



            ArrayList<User> userList = new ArrayList<>();
            userList.add(new User("John", "123456", "John@gmail.com", "12345678"));
            userList.add(new User("Ali", "2223131", "Ali@gmail.com", "21321424"));
            userList.add(new User("Brian", "123132", "Brian@gmail.com", "21323212"));
            userList.add(new User ("Dino", "sadadad"));
            Collections.sort(userList);


            for (User user : userList) {
                System.out.println(user);
            }



        }

}