/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emp;

/**
 *
 * @author Rashmitha
 */
public class EmployeeDriver {

    
    
    public static void main(String[] args) {
        Employee emp = new Employee("rashmi", "surapaneni", "123");
        
        System.out.println( emp.getFirstName());
        System.out.println( emp.getLastName());
        System.out.println( emp.getSSN());
        HouryEmployee he = new HouryEmployee(8, 8, "rashmi", "surap", "123");
        System.out.println(he.calcWeeklySalary());
        System.out.println(he.getFullName());
        
       
        
        
    }

}
