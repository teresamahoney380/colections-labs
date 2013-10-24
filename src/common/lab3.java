
package common;
import java.util.*;

/**
 *
 * @author Teresa Mahoney
 */
public class lab3 {
    
    public static void main(String[] args) {
   List<Employee> employeeList = new ArrayList<Employee>();
    employeeList.add(new Employee("Smith","Albert","111-11-1111"));
    employeeList.add(new Employee("Jones","Grace","222-22-2222"));
    employeeList.add(new Employee("Smith","Albert","111-11-1111"));
    employeeList.add(new Employee("Garcia","Maria","333-11-1111"));
    
        System.out.println(employeeList.size()); 
        
        Employee e1= employeeList.get(3);
        
        System.out.println(e1);
        
        System.out.println("\nGenerified employee list:");
        for(Employee e : employeeList) {
            System.out.println(e);
        }
        
        // code for lab 4
        // Now let's create a Set to remove duplicates  
        // Generics not used in this example
        Set noDupes = new HashSet(employeeList);
        // copy the results back to original -- no dupes!
        employeeList = new ArrayList(noDupes);
        
        System.out.println(employeeList.size()); 
    }
    
}
