
// https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html
import java.util.HashMap;


public class Emilymap {
     public static void main(String[] args) {

    HashMap<String, Double> employees = new HashMap<String, Double>();

    employees.put("john", 123.3);
    employees.put("luke", 234.4);

    System.out.println(employees);

    
    double result = 0; 

    for (Double v : employees.values()) {  // for each value
        result +=  v.doubleValue();
    }

    System.out.println("The sume is " + result);
  }
 
}
