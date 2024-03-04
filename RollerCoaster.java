import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
/** 
 * ACS-1904 Lab 7 Train
 * @Sveinson 
*/

public class RollerCoaster{
    
    private String name;
    private ArrayList<Rider> riders;
    
    // constructors
    public RollerCoaster(){
        name = "unknown";
        riders = new ArrayList();
    }
    
    public RollerCoaster(String n){
        name = n;
        riders = new ArrayList();
    }
    
    // getters
    /*****************************************
    * Description: get the name of the RollerCoaster
    * 
    * @return       String name, the name of the RollerCoaster
    * ****************************************/
    public String getName(){
        return name;
    } // end get name;
    
    // setters
    
    // other
    /*****************************************
    * Description: print a list of riders along with their fares
    * 
    * ****************************************/
    public void displayRiders(){
        
        System.out.println(name + " Riders:");
        
        for(Rider r: riders){
            System.out.print("$" + r.getFare() + "\t");
            System.out.println(r.getName());
        }
    }// end display passenhers
    
    /*****************************************
    * Description: add a rider to the list of riders
    * 
    * @param        Rider p, the rider to be added.
    * ****************************************/
    public void addRider(Rider p){
        riders.add(p);
    }// end addPassenger
}

    /*****************************************
    * Description: brief description of the methods purpose
    * 
    * @param        each parameter of the method should be listed with an @param
    * @param        parametername description of parameter
    * 
    * @return       any return value will be noted here
    * ****************************************/
