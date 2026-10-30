package model;

import deduction.SalaryCalculable;
import deduction.pf;
import deduction.tax;

import model.Employee;

public class parttime extends Employee implements SalaryCalculable {

   private int hoursWorked;
    private int hourlyRate;

    public parttime(int id, String name, String shift,int hoursWorked,int hourlyRate){
    super(id,name,shift);

    this.hoursWorked = hoursWorked;
    this.hourlyRate = hourlyRate;
    
}
public void sethoursWorked(int hoursWorked){
    this.hoursWorked = hoursWorked;
}
public void sethourlyRate(int hourlyRate){
    this.hourlyRate = hourlyRate;
}
public int gethoursWorked(){
    return hoursWorked;
}
public int gethourlyRate(){
    return hourlyRate;
}
public int calculateGrossSalary(){   
    return hoursWorked*hourlyRate;
}
public int calculateNetSalary() {

    pf p = new pf();
    tax t = new tax();

     return calculateGrossSalary() - p.calculateDeduction() - t.calculateDeduction();
}

public void displayDetails() {

    pf p = new pf();
    tax t = new tax();

    System.out.println("Employee Type: Part Time");
    System.out.println("Id: " + getid());
    System.out.println("Name: " + getname());
    System.out.println("Shift: " + getshift());

     System.out.println();

    System.out.println("Hours Worked: " + hoursWorked);
    System.out.println("Hourly Rate: " + hourlyRate);

      System.out.println();

    System.out.println("Gross Salary : " + calculateGrossSalary());
    System.out.println("PF: " + p.calculateDeduction());
    System.out.println("Tax: " + t.calculateDeduction());
     
      System.out.println();

    System.out.println("Net Salary: " + calculateNetSalary());
    System.out.println();
} 
}


