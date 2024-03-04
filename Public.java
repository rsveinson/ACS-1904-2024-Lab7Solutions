import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
/** 
 * ACS-1904 Lab 7 Public
 * @Sveinson 
*/

public class Public implements Rider, Comparable<Public>{
    
    private String firstName;
    private String lastName;
    private int age;
    
    // constructors
    public Public(String fn, String ln, int a){
        firstName = fn;
        lastName = ln;
        age = a;
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
    
    //required method implementations from Passenger
    /*****************************************
    * Description: get the full name of a Public object
    * 
    * @return       String catenatin of firstName and lastName
    * ****************************************/
    public String getName(){
        return firstName + " " + lastName;
    } // end getname()
    
    /*****************************************
    * Description: computes the fare the rider will pay
    * 
    * @return       double fare, adult, youth or senior
    * ****************************************/
    public double getFare(){
        double fare;
     
        if(age < YOUTHAGE)
            fare = 5.99;
        else if(age <= SENIORAGE)
            fare = 8.99;
        else
            fare = 6.50;
            
        return fare;
    }
    
    // required from Comparable
    /* there will be a few different implementations 
     * to order the list differently based on variations of name
     */
    // alphabetical by last name
    // public int compareTo (Public p) {
        // return lastName.compareTo(p.lastName);
    // }
    
    // reverse alphabetical by last name
    // public int compareTo (Public p) {
        // return p.lastName.compareTo(lastName);
    // }
    
    // alphabetical by last name then first name
    public int compareTo (Public p) {
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
