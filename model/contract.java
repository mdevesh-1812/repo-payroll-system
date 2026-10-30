package model;

import deduction.SalaryCalculable;
import deduction.pf;
import deduction.tax;

import model.Employee;

public class contract extends Employee implements SalaryCalculable {

    private int contractAmount;
    private int contractDuration;

    public contract(int id, String name, String shift,int contractAmount,int contractDuration){
        super(id,name,shift);

        this.contractAmount = contractAmount;
        this.contractDuration = contractDuration;
    } 

public void setcontractAmount(int contractAmount){
    this.contractAmount = contractAmount;
}
public void setcontractDuration(int contractDuration){
    this.contractDuration = contractDuration;
}
public int getcontractAmount(){
    return contractAmount;
}
public int getcontractDuration(){
    return contractDuration;
}
public int calculateGrossSalary(){   
    return contractAmount*contractDuration;
}

public int calculateNetSalary() {

    pf p = new pf();
    tax t = new tax();

     return calculateGrossSalary() - p.calculateDeduction() - t.calculateDeduction();
}
    public void displayDetails() {

    pf p = new pf();
    tax t = new tax();

    System.out.println("Employee Type: Contract");
    System.out.println("Id: " + getid());
    System.out.println("Name: " + getname());
    System.out.println("Shift: " + getshift());

     System.out.println();

    System.out.println("Contract Amount: " + contractAmount);
    System.out.println("Contract Duration: " + contractDuration);

      System.out.println();

    System.out.println("Gross Salary : " + calculateGrossSalary());
    System.out.println("PF: " + p.calculateDeduction());
    System.out.println("Tax: " + t.calculateDeduction());
    
      System.out.println();

    System.out.println("Net Salary: " + calculateNetSalary());
   
    System.out.println();
}
}
