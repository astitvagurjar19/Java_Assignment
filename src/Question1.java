// Q1: Write a class with FirstName, LastName & age field. Print Firstname, LastName & age using static block, static method & static variable respectively.

public class Question1 {

    //Declaring static variable
    private static String firstName;
    private static String lastName;
    private static int age;

    //Declaring static block
    static {
        firstName = "Astitva";
        lastName = "Gurjar";
        age = 22;
    }

    // Declaring static method
    public static void displaying() {
        System.out.println("firstName: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Age: " + age);
    }
    public static void main(String args[]) {
        Question1.displaying();
    }
}