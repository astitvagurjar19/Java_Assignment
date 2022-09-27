//Q5: Create a class named Employee with fields firstname,lastname,age and designation.
//The class should:
//    have all types of constructors to initialize the object
//    class should also have setter methods to update a particular field
//    Override its toString method to display a meaningful message using all these fields.
class Employee{
    private String firstName;
    private String lastName;
    private String designation;
    private int  age;

    //Non-parametrized Employee class  constructor
    Employee(){
        this.firstName="Astitva";
        this.lastName="Gurjar";
        this.age=22;
        this.designation="Software Engineer";
    }
    //Parametrized Employee class  constructor
    Employee(String firstName,String lastName,int age,String designation){
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
        this.designation=designation;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return this.firstName+" "+this.lastName+" of  age "+this.age+" is at "+this.designation+"  position in company";
    }
}
public class Question5 {
    public static void main(String args[]){
        Employee em1 = new Employee();
        Employee em2 = new Employee("Amrit","Sharma",30,"Project Manager");
        Employee em3 = new Employee();
        em3.setFirstName("John");
        em3.setLastName("Fererro");
        em3.setAge(40);
        em3.setDesignation("Project Head");
        //em1.toString();
        System.out.println(em1);
        System.out.println(em2);
        System.out.println(em3);
    }
}