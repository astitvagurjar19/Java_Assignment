// Q2: Write a program to read user input until user writes XDONE and then show the entered text by the user on commandline

//importing scanner class
import java.util.Scanner;

public class Question2 {

    String input; //variable  to take  user input.
    Scanner sc = new Scanner(System.in);

    //Method  to print take user input and check for 'XDONE'  to terminate.
    void printUntilXDONE(){
        boolean status=true;
        do {
            System.out.println("Enter input: ");
            input=sc.nextLine();
            System.out.println("Entered  input : "+input);
            if(input.equalsIgnoreCase("XDONE")){
                status=false;
            }

        }while (status==true);
    }
    public static void main(String args[]){
        Question2 qu = new Question2();
        qu.printUntilXDONE();
    }
}