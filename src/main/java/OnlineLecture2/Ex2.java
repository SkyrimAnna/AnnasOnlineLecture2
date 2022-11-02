package OnlineLecture2;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(" Restaurant Bill Calculator");

        System.out.println("\n Enter bill total : £");
        double bill = scanner.nextDouble();

        System.out.println("\n Enter number Of people");
        int people = scanner.nextInt();

        double eachPay = bill / people;

        System.out.format("\n A bill of £%.2f split between"+ " " + people + " " + "Each will pay £%.2f",bill, eachPay  );






    }




}
