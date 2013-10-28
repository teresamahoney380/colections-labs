/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package common;
import java.util.*;

/**
 *
 * @author Owner
 */
public class Lab5 {

    public static void main(String[] args) {
        Employee e1 = new Employee("Smith", "Albert", "111-11-1111");
        Employee e2 = new Employee("Jones", "Grace", "222-22-2222");
        Employee e3 = new Employee("Smith", "Albert2", "111-11-1111");
        Employee e4 = new Employee("Garcia", "Maria", "333-33-3333");
        
        Map<String,Employee> employeeMap= new HashMap<String,Employee>();
        employeeMap.put("111-11-1111", e1);
        employeeMap.put("222-22-2222", e2);
        employeeMap.put("111-11-1111", e3);
        employeeMap.put("333-33-3333", e4);
     
        // shows that duplicate key overwrote the first values
      Employee e = (Employee)employeeMap.get("111-11-1111");
        System.out.println("Retrieving employee with ssn: 111-11-1111: " + e);
        
        //
        // loop thru object
        Set keys = employeeMap.keySet();
        for(Object key : keys) {
            Employee found = (Employee)employeeMap.get(key);
            System.out.println(found.toString());
        }
    }
        
    }

