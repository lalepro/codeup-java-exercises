import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        int userNumber;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        userNumber = sc.nextInt();
        System.out.println("User entered: --> \"" + userNumber + "\" <--");

        String firstName;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Name: ");
        firstName = sc.next();
        System.out.println("User entered: --> \"" + firstName);

        String lastName;
        Scanner ac = new Scanner(System.in);
        System.out.println("Enter Last Name: ");
        lastName = ac.next();
        System.out.println("User entered: --> \"" + lastName);

        String userName;
        Scanner dc = new Scanner(System.in);
        System.out.println("Enter Username: ");
        userName = dc.next();
        System.out.println("User entered: --> \"" + userName);

        String userSentences;
        Scanner ac = new Scanner(System.in);
        System.out.print("Tell me why you want to study at CodeUp? ");
        userSentences = ac.next();
        System.out.println("User entered: --> \"" + userSentences + "\" <--");

        String userSentence;
        Scanner sc = new Scanner(System.in);
          System.out.println("Tell me why you want to study at CodeUp? ");
        userSentence = sc.nextLine();
        System.out.println("User entered: --> \"" + userSentence + "\" <--");


        int length;
        Scanner ac = new Scanner(System.in);
        System.out.print("Enter length: ");
        length = ac.nextInt();


        int width;
        Scanner bc = new Scanner(System.in);
        System.out.print("Enter width:  ");
        width = bc.nextInt();

        int area;
        area = length * width;

        System.out.println("User entered: --> \"" + width + length + " Area: " + area + "\" <--");




    }
}

