
package common;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * The purpose of Lab6 is to store in a TreeMap and demonstrate 
 * @author Teresa mahoney
 */
public class Lab6 {
    public static void main(String[] args) {
        Employee e1 = new Employee("Smith", "Albert", "111-11-1111");
        Employee e2 = new Employee("Jones", "Grace", "222-22-2222");
        Employee e3 = new Employee("Smith", "Albert2", "111-11-1111");
        Employee e4 = new Employee("Garcia", "Maria", "333-33-3333");
        
         Map<String,Employee> employeeMap= new TreeMap<String,Employee>();
        employeeMap.put("111-11-1111", e1);
        employeeMap.put("222-22-2222", e2);
        employeeMap.put("111-11-1111", e3);
        employeeMap.put("333-33-3333", e4);
        
        // print sorted by key
        Set keys = employeeMap.keySet();
        for(Object key : keys) {
            Employee found = (Employee)employeeMap.get(key);
            System.out.println(found.toString());
        }
        
        
    }
}
