import java.util.Scanner;

public class Input {


    public static void main(String [] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println();


    System.out.print("Enter user's name here: " ); 

    String name;
    
    name = scanner.nextLine();

    System.out.println();



    System.out.print("Enter user's age here: ");

    int age;

    age = scanner.nextInt();

    System.out.println();


    System.out.print("Enter user's weight here: ");

    float weight;

    weight = scanner.nextFloat();

    System.out.println();


    System.out.print("Enter if the user's is a smoker (true or false): ");

    boolean smoker;

    smoker = scanner.nextBoolean();

    System.out.println();


    System.out.println("Outputting all the information back to the user... ");


    System.out.println("User's name is  " + name);

    System.out.println("User's age is " + age);

    System.out.println("User's weight is " + weight);

    System.out.println("User is a smoker (true or false) " + smoker);






    





    
    




    



    



    }




}
