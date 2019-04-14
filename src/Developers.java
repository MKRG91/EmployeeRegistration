import java.util.ArrayList;

public class Developers extends User {
    private String name;
    private String language;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Developers(String name, String language){
        super(name);
        setLanguage(language);
    }

    @Override
    public void register(ArrayList usernames, String name) {
        if(usernames.contains(name)){
            setRegistered(false);
            System.out.println("This username is already registered in the Developers database. " + " || " + getRegistered());
        }else{
            usernames.add(name);
            setRegistered(true);
            System.out.println("The user " + name + " has registered as Developer for the " + language + " programming language." + " || " + getRegistered());
        }
    }
}
