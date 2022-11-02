package OnlineLecture2;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("First Name");
        String firstname = scanner.next();

        System.out.println("\n Last Name");
        String lastname = scanner.next();

        System.out.println("\n Age");
        int age = scanner.nextInt() ;

        System.out.println("\n Your Name Is" + " " + firstname + " " + lastname + " " + "And you are" + " " + age + " " + "Years Old" );
    }
}
