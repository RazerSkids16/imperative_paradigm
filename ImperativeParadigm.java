/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mguga
 */
import java.util.*;

public class ImperativeParadigm {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Imperative Paradigm");//step by step 
        while (true) {
            System.out.println("1. ADD\n"
                    + "2. SUBTRACT\n"
                    + "3. MULTIPLY\n"
                    + "4. DIVIDE\n"
                    + "5. MODULO\n"
                    + "6. EXIT");
            System.out.print("Select Operation: ");

            int option = sc.nextInt();
            if (option == 1) {
                System.out.println("Addition");
                System.out.print("Enter 1st value: ");
                double a = sc.nextDouble();
                System.out.print("Enter 2nd value: ");
                double b = sc.nextDouble();
                System.out.printf("Answer: %.0f\n", a + b);

            }
            if (option == 2) {
                System.out.println("Subraction");
                System.out.print("Enter 1st value: ");
                double a = sc.nextDouble();
                System.out.print("Enter 2nd value: ");
                double b = sc.nextDouble();
                System.out.printf("Answer: %.0f\n", a - b);

            }
            if (option == 3) {
                System.out.println("Multiplication");
                System.out.print("Enter 1st value: ");
                double a = sc.nextDouble();
                System.out.print("Enter 2nd value: ");
                double b = sc.nextDouble();
                System.out.printf("Answer: %.2f\n", a * b);

            }
            if (option == 4) {
                System.out.println("Division");
                System.out.print("Enter 1st value: ");
                double a = sc.nextDouble();
                System.out.print("Enter 2nd value: ");
                double b = sc.nextDouble();
                System.out.printf("Answer: %.2f\n", a / b);

            }
            if (option == 5) {
                System.out.println("Modulo");
                System.out.print("Enter value: ");
                double a = sc.nextDouble();
                System.out.print("Modulo by: ");
                double b = sc.nextDouble();
                System.out.printf("Answer: %.2f\n", a % b);

            }
            if (option == 6) {
                System.exit(0);

            }
        }
    }
}
