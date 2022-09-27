//Q4: Create a two-dimensional array of integers and display:
       // sum of all elements of each column
        //sum of all elements of each row

public class Question4 {
    //One  way of defining two-dimensional array of  integer;
    //int arr[][]=new int[3][3];
    //another  way of defining and initializing two-dimensional array of  integer;
    int  arr[][]={{1,2,3},{4,5,6},{7,8,9}};
    //Method  to find sum of columns
    void sumOfColumns(){
        int  sum=0; //variable  to store sum  of columns
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                sum=sum+arr[j][i];
            }
            System.out.println("Sum of column "+(i+1)+": "+sum);
            sum=0;
        }
    }
    //Method  to find  sum of rows
    void sumOfRows(){
        int  sum=0; //variable  to store sum  of rows
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                sum=sum+arr[i][j];
            }
            System.out.println("Sum of row "+(i+1)+": "+sum);
            sum=0;
        }
    }
    public static void main(String args[]){
        Question4 qu = new Question4(); // creating instance of  Question4 class
        System.out.println("------------Sum of Columns-------------");
        System.out.println();
        qu.sumOfColumns(); //Calling sumOfColumns by Question4  instance  variable
        System.out.println();
        System.out.println("------------Sum of Rows-----------------");
        System.out.println();
        qu.sumOfRows(); //Calling sumOfRows by Question4  instance  variable
    }
}