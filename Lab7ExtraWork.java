import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;
/** 
 * ACS-1904 Lab 7 Extra work
 * @Sveinson 
*/

public class Lab7ExtraWork{
    public static void main(String[] args){
        // create a new train
        //ArrayList<Person> people = new ArrayList<>();
        Public[] people = new Public[11]; // arrrgghhh a magic number
        
        // create some person/pasengers
        // people.add(new Person("Philip", "Fry", 17));
        // people.add(new Person("Hermes", "Conrad", 21));
        // people.add(new Person("Kif", "Kroker", 15));
        // people.add(new Person("Zapp", "Branningan", 35));
        // people.add(new Person("Bender", "Rodriguez", 53));
        // people.add(new Person("Turanga", "Leela", 72));
        // people.add(new Person("Hubert", "Farnsworth", 102));
        // people.add(new Person("Yancy", "Fry", 23));
        // people.add(new Person("Turanga", "Leela", 72));
        // people.add(new Person("Dwight", "Conrad", 12));
        // people.add(new Person("Cubert", "Farnsworth", 12));
        people[10] = (new Public("Philip", "Fry", 17));
        people[0] = (new Public("Hermes", "Conrad", 21));
        people[1] = (new Public("Kif", "Kroker", 15));
        people[2] = (new Public("Zapp", "Branningan", 35));
        people[3] = (new Public("Bender", "Rodriguez", 53));
        people[4] = (new Public("Turanga", "Leela", 72));
        people[5] = (new Public("Hubert", "Farnsworth", 102));
        people[6] = (new Public("Yancy", "Fry", 23));
        people[7] = (new Public("Turanga", "Leela", 72));
        people[8] = (new Public("Dwight", "Conrad", 12));
        people[9] = (new Public("Cubert", "Farnsworth", 12));
        
        //Collections.sort(people);
        Arrays.sort(people);
        
        for(Public p: people)
            System.out.println(p.getName());           
            
        // comparator
        Arrays.sort(people, new SortByAge());

        for(Public p: people)
            System.out.println(p.getName() + " " + p.getAge());
            
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
