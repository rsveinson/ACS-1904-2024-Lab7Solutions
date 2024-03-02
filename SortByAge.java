import java.util.Comparator;
public class SortByAge implements Comparator<Public> 
{
    public int compare(Public o1, Public o2) {
        //int rt;
        //String st = o1.getName() + o1.getYear();
        
        // if(o1.getYear()-o2.getYear() == 0){
            // rt = o1.compareTo(o2);
        // }else{
            // rt = o1.getYear()-o2.getYear();
        // }
        
        return o1.getAge() - o2.getAge();
        //return rt;        
        //return st.compareTo(o2.getName() + o2.getYear());
    }
} 