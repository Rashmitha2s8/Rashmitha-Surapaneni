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
public class HouryEmployee extends Employee
{
    private double hourlyRate;
private int hrsWorked;

    public HouryEmployee(double hourlyRate, int hrsWorked, String firstName, String lastName, String SSN) {
        super(firstName, lastName, SSN);
        this.hourlyRate = hourlyRate;
        this.hrsWorked = hrsWorked;
    }
public double calcWeeklySalary ()
{
    return hourlyRate * hrsWorked;
}

    @Override
    public String toString() 
    {
        return "HouryEmployee" + "hourlyRate=" + hourlyRate + ", hrsWorked=" + hrsWorked + super.toString();
    }




    
}
