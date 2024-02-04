import java.util.Scanner;
public class UserTest {


    //Vince Ted Matthew D. Chua
    //February 04th, 2024

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        //In this case this will Display the "Welcome-Prompt"
        System.out.println("Welcome To Glenville!");
        System.out.println("Please type: yes to procceed, no to exit.");
        String userInp = sc.nextLine().toLowerCase(); //converts string input to lower-case to avoid case sensitivity.


        //if the user chooses <yes>
        if (userInp.equals("yes")) {
            System.out.println("Processing.......");


            //if the user chooses <no>
        } else if (userInp.equals("no")) {
            System.out.println("System Terminating... Have a great Day!");
            System.exit(0); //this will terminate the proceeding statements, hindering to proceed
        } else {
            System.out.println("Oops! Wrong Input, please try again.");
            System.exit(0); //This is if the user said either: "Maybe" or "Perhaps"
        }

        //Will Display
        System.out.println("Please indicate the necessary details such as: First Name, Last Name, Email, Address, Phone Number");

        User myUser = new User.UserBuilder("Vince")
                .lastName("Chua")
                .email("vince.chua@neu.edu.ph")
                .address("7 Central Ave, NEU")
                .phone(2019896786)
                .age(22)
                .build();

        User myUser2 = new User.UserBuilder("Alyssa")
                .lastName("Domingo")
                .email("amc.domingo@neu.edu.ph")
                .address("7 Central Ave, NEU")
                .phone(929347002)
                .age(25)
                .build();


        //Loads out the user information for User (1)
        System.out.println("\nUser 1: ");
        loadUserInfo(myUser);

        System.out.println("\nUser 2: ");
        loadUserInfo(myUser2);
    }


    //Making it more readable and promotes conciseness to code
    //the loadUserInfo class name is called in to the system out
    //just like scanner whatever it is inputted will displaeyd to respective delegates.
    private static void loadUserInfo(User myUser) {
        System.out.println("First Name: "  + myUser.getName());
        System.out.println("Last Name:  "  + myUser.getLastName());
        System.out.println("Email:      "  + myUser.getEmail());
        System.out.println("Address:    "  + myUser.getAddress());
        System.out.println("Phone:      "  + myUser.getPhone());
        System.out.println("Age:        "  + myUser.getAge());


    }
}

  