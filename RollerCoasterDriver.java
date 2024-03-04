//import java.util.Scanner;
//import java.io.File;
//import java.io.FileNotFoundException;
/** 
 * ACS-1904 Lab 7 Driver
 * @Sveinson 
*/

public class RollerCoasterDriver{
    public static void main(String[] args){
        // create a new train
        RollerCoaster coaster = new RollerCoaster("Big Thunder");
        
        // create some riders
        coaster.addRider(new Public("Philip", "Fry", 17));
        coaster.addRider(new Student("Hermes", "Conrad", 21, 12345));
        coaster.addRider(new Student("Kif", "Kroker", 15, 65123));
        coaster.addRider(new Public("Zapp", "Branningan", 35));
        coaster.addRider(new Public("Bender", "Rodriguez", 72));
        coaster.addRider(new Public("Amorphous", "Blob", 72));
        coaster.addRider(new Student("Hubert", "Farnsworth", 102, 11111));
        coaster.addRider(new Student("Yancy", "Fry", 25, 32123));
        coaster.addRider(new Student("Turanga", "Leela", 72, 23341));
        coaster.addRider(new Public("Dwight", "Conrad", 45));
        coaster.addRider(new Public("Cubert", "Farnsworth", 12));
        
        // display the  Coaster name and rider list
        System.out.println("Roler Coaster Name: " + coaster.getName());
        System.out.println("---------------------------------\n");
        
        coaster.displayRiders();
        


        System.out.println("\nend of program");
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
