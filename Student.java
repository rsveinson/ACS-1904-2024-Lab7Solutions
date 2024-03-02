import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
/** 
 * ACS-1904 Lab 7 Student
 * @Sveinson 
*/

public class Student implements Rider, Comparable<Student>{
    
    private String firstName;
    private String lastName;
    private int id;
    private int age;
    
    // constructors
    public Student(String fn, String ln, int a, int id){
        firstName = fn;
        lastName = ln;
        age = a;
        this.id = id;
    }// end constructor
    
    // getters
    public String getFirstName(){
        return firstName;
    }
    
    public String getLastName(){
        return lastName;
    }
    
    public int getAge(){
        return age;
    }
    
    //required method implementations from Rider
    /*****************************************
    * Description: get the full name of a Student object
    * 
    * @return       String catenatin of firstName and lastName
    * ****************************************/
    public String getName(){
        return firstName + " " + lastName;
    } // end getname()
    
    /*****************************************
    * Description: computes the type of fare the passenger will pay
    * 
    * @return       String type of fare, regular, youth or senior
    * ****************************************/
    public double getFare(){
        double fare;
     
        if(age < STUDENTAGELIMIT)
            fare = 6.50;
        else{
            fare = 7.50;
        }
            
        return fare;
    }
    
    // required from Comparable
    /* there will be a few different implementations 
     * to order the list differently based on variations of name
     */
    // alphabetical by last name
    // public int compareTo (Person p) {
        // return lastName.compareTo(p.lastName);
    // }
    
    // reverse alphabetical by last name
    // public int compareTo (Person p) {
        // return p.lastName.compareTo(lastName);
    // }
    
    // alphabetical by last name then first name
    public int compareTo (Student p) {
        String s = lastName + firstName;
        String o = p.lastName + p.firstName;
        return s.compareTo(o);
    }
}

    /*****************************************
    * Description: brief description of the methods purpose
    * 
    * @param        each parameter of the method should be listed with an @param
    * @param        parametername description of parameter
    * 
    * @return       any return value will be noted here
    * ****************************************/
