        
/**
 * Rider interface: supplies required methods for name and fare
 *                      for potential riders on the Big Thunder Rollercoaster
 *                      
 *
 * @author Sveinson
 * @version ACS-1904 Lab 7
 */
public interface Rider
{
    /* could also declare these constants in some utility class
     * remember that these are automatically public static final
     * Since these values are tied to the getFare() method this
     * seems like an appropriate place for them.
     */
    // some constants
    int YOUTHAGE = 18;      // youth fare upper limit
    int SENIORAGE = 65;     // senrior fare lower limit
    int STUDENTAGELIMIT = 25;   // dividing age for student fares
    /**
     * getName()
     *
     * @return   String rider's name
     */
    String getName();
    
    /**
     * getFare()
     *
     * @param   int age:    rider's age
     * @return   double fare,   different fares for different ages in Student
     *                          and in Public
     *                              
     */
    double getFare();
}
