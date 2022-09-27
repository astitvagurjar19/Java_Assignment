// Q3) Write a java program to show following menu to the user:
//
//*******Menu*******
//1. Calculate Area of Circle
//2. Calculate Circumference of a Circle
//3. Exit.
//Choose an option (1-3):
//
//Take radius as user input.

//class defined here
import java.util.Scanner;

public class Question3 {
    static int radius; //static variable to store radius of circle
    static Scanner sc = new Scanner(System.in);

    //Static method calculateRadius to calculate Area of Circle
    static void calculateRadius() {
        System.out.println("Enter radius: ");
        radius = sc.nextInt();
        System.out.println("Area of Circle : " + 3.14 * radius * radius);
    }

    //Static method calculateCircumference to calculate Circumference of Circle
    static void calculateCircumference() {
        System.out.println("Enter radius: ");
        radius = sc.nextInt();
        System.out.println("Area of Circle : " + 2 * 3.14 * radius);
    }

    public static void main(String args[]) {
        int operation = 1; // Variable to handle operations
        while (operation != 3) {
            System.out.println("*******Menu*******");
            System.out.println("1. Calculate Area of Circle");
            System.out.println(" 2. Calculate Circumference of a Circle");
            System.out.println(" 3. Exit.");
            System.out.println(" Choose an option (1-3): ");
            operation= sc.nextInt();
            //Switch method to choose from menu
            switch (operation) {
                case 1:
                    Question3.calculateRadius();
                    break;
                case 2:
                    Question3.calculateCircumference();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Warning : Enter correct input");
                    break;
            }
        }
    }
}