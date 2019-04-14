import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainClass {
    /*
    This method is static - it just needs to be called
    It starts the process of registering a new Admin
    It takes as parameter the ArrayList in which we want to store the usernames
     */
    public static void registerAdmin(ArrayList adminNames){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the username of the employee: ");
        String username = scanner.nextLine();
        scanner = new Scanner(System.in);
        System.out.print("Enter the department of the employee: ");
        String department = scanner.nextLine();
        Admins admin = new Admins(username, department);
        admin.register((ArrayList) adminNames, admin.getName());
    }


    /*
    This method is static - it just needs to be called
    It starts the process of registering a new Developer
    It takes as parameter the ArrayList in which we want to store the usernames
     */
    public static void registerDeveloper(ArrayList developerNames){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the username of the employee: ");
        String username = scanner.nextLine();
        scanner = new Scanner(System.in);
        System.out.print("Enter the programming language the employee knows: ");
        String language = scanner.nextLine();
        Developers developer = new Developers(username, language);
        developer.register((ArrayList) developerNames, developer.getName());
    }


    /*
    This method is static and is the function that starts the whole logic of the program.
    It asks for the position of the employee we are registering and
    depending the choice it calls one of the two functions above.
    It needs as parameters the two ArrayLists in which we are going to store the
    usernames of the employees.
     */
    public static void start(ArrayList adminNames, ArrayList developerNames){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the position of the employee (Admin / Developer) : ");
        String position = scanner.nextLine();

        if(position.equals("Admin") || position.equals("ADMIN") || position.equals("admin")){
            registerAdmin((ArrayList) adminNames);
            restart((ArrayList) adminNames, (ArrayList) developerNames);
        }else if(position.equals("Developer") || position.equals("DEVELOPER") || position.equals("developer")){
            registerDeveloper((ArrayList) developerNames);
            restart((ArrayList) adminNames, (ArrayList) developerNames);
        }
    }


    /*
    This method restarts the whole process. If we call the main method to do this, all the
    usernames are going to be deleted from the ArrayLists since they are part of the main method.
    It needs two parameters, the two ArrayLists for the usernames of each category of employees.
     */
    public static void restart(ArrayList adminNames, ArrayList developerNames){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Do you want to register another employee? (Y/N): ");
        String choice = scanner.nextLine();
        if(choice.equals("Y") || choice.equals("Yes") || choice.equals("yes") || choice.equals("YES")){
            start((ArrayList) adminNames, (ArrayList) developerNames);
        }else if(choice.equals("N") || choice.equals("No") || choice.equals("no") || choice.equals("NO")){
            System.exit(0);
        }
    }


    /*
    In the main method we declare the two Arraylists that will store the usernames for each
    type of employee and call the start() function with them as parameters. The rest are taken care
    recursively by the start() function since it is calling other methods which are calling other methods
    and so on.
     */
    public static void main(String[] args){
        List<String> developerNames = new ArrayList<String>();
        List<String> adminNames = new ArrayList<String>();

        start((ArrayList) adminNames, (ArrayList) developerNames);
    }

}
