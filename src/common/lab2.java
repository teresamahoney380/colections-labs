
package common;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Teresa Mahoney
 */
public class lab2 {
    public static void main(String[] args) {
   List employeeList = new ArrayList();
    employeeList.add(new Employee("Smith","Albert","111-11-1111"));
    employeeList.add(new Employee("Jones","Grace","222-22-2222"));
    employeeList.add(new Employee("Smith","Albert","111-11-1111"));
    employeeList.add(new Employee("Garcia","Maria","333-11-1111"));
    
        System.out.println(employeeList.size()); 
        
        Employee e1= (Employee)employeeList.get(3);
        
        System.out.println(e1);
        
        for(int i=0; i<employeeList.size(); i++){
            System.out.println(employeeList.get(i));
        }
        
   }    
}
