public class User {

    private String name;
    private String password;
    private String email;
    private String phoneNumber;


    public User (String name, String password, String email, String phoneNumber){

        this.name = name;
        this.password = password;

        if (email.contains("@")) {

            this.email = email;

        } else  {

            throw new IllegalArgumentException("Email is not valid");

        }

        this.phoneNumber = phoneNumber;
    }

    public User (String name, String password){

        this.name = name;
        this.password = password;
    }


    // Setter and getter for name
    public String getName (){

        return name;
    }

    public void setName(String name){

        this.name = name;
    }


    // Setter and getter for password
    public String getPassword(){

        return password;
    }

    public void setPassword (String password){

        this.password = password;
    }

    // Setter and getter for email
    public String getEmail () {

        return email;
    }

    public void setEmail (String email){

        this.email = email;
    }


    // Setter and getter for phoneNumber
    public String getPhoneNumber () {

        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {

        this.phoneNumber = phoneNumber;
    }


    public String toString() {
        String result = "Navn: " + name;
        if (email != null) {
            result += ", Email: " + email;
        }
        if (phoneNumber != null) {
            result += ", Telefon: " + phoneNumber;
        }
        return result;
    }

}
