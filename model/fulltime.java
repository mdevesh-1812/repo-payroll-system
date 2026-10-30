package model;

import deduction.SalaryCalculable;
import deduction.pf;
import deduction.tax;

import model.Employee;


public class fulltime extends Employee implements SalaryCalculable {

    private int basicSalary; 
    private int hra; 
    private int allowance;

    public fulltime(int id, String name, String shift,int basicSalary,int hra,int allowance){
        super(id,name,shift);

        this.basicSalary = basicSalary;
        this.hra = hra;
        this.allowance = allowance;
    }

public void setbasicSalary(int basicSalary){
     this.basicSalary = basicSalary;
}
public void sethra(int hra){
     this.hra = hra;
}
public void setallowance(int allowance){
     this.allowance = allowance;
}
public int getbasicSalary(){
    return basicSalary;
}
public int gethra(){
    return hra;
}
public int getallowance(){
    return allowance;
}
public int calculateGrossSalary(){ 
    
    return basicSalary + hra + allowance;
}
public int calculateNetSalary() {

    pf p = new pf();
    tax t = new tax();

     return calculateGrossSalary() - p.calculateDeduction() - t.calculateDeduction();
    }

public void displayDetails() {

    pf p = new pf();
    tax t = new tax();

    System.out.println("Employee Type: Full Time");
    System.out.println("Id: " + getid());
    System.out.println("Name: " + getname());
    System.out.println("Shift: " + getshift());

     System.out.println();

    System.out.println("Basic Salary: " + basicSalary);
    System.out.println("HRA: " + hra);
    System.out.println("Allowance: " + allowance);

     System.out.println();

    System.out.println("Gross Salary : " + calculateGrossSalary());
    System.out.println("PF: " + p.calculateDeduction());
    System.out.println("Tax: " + t.calculateDeduction());

     System.out.println();

    System.out.println("Net Salary: " + calculateNetSalary());

    System.out.println();
}
}



