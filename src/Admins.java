import java.util.ArrayList;

public class Admins extends User {
    private String name;
    private String department;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Admins(String name, String department){
        super(name);
        setDepartment(department);
    }

    @Override
    public void register(ArrayList usernames, String name) {
        if(usernames.contains(name)){
            setRegistered(false);
            System.out.println("This username is already registered in the Admins database. " + " || " + getRegistered());
        }else{
            usernames.add(name);
            setRegistered(true);
            System.out.println("The user " + name + " has registered as Admin in the " + department + " department " + " || " + getRegistered());
        }
    }
}
