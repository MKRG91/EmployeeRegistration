import java.util.ArrayList;

public class User {
    /*
    The name all users have
    and the status of registration (either true or false)
     */
    private String name;
    private Boolean registered;


    /*
    Getters and Setters
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getRegistered() {
        return registered;
    }

    public void setRegistered(Boolean registered) {
        this.registered = registered;
    }


    /*
    Default constuctor
     */
    public User(){

    }

    /*
    Constructor that sets the name and default status of
    every user before registration. Inherited to Admins and Developers with the use
    of super()
     */
    public User(String name){
        setName(name);
        setRegistered(false);
    }


    /*
    This method does the registration of the created users
    and checks the corresponding array list for if the username is already registered.
    A separate action is taken for each case. Inherited to Admins and Developers but overriden
    to match each specific occasion.
     */
    public void register(ArrayList usernames, String name){
            if(usernames.contains(name)){
                setRegistered(false);
                System.out.println("This username is already registered. " + " || " + getRegistered());
            }else{
                usernames.add(name);
                setRegistered(true);
                System.out.println("You are now registered." + " || " + getRegistered());
            }
    }

}
