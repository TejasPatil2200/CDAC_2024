package org.sdassignment5;

public class Employee {
    private int employeeId;
    private String name;
    private double salary;

    
    private static int totalEmployees = 0;
    private static double totalSalaryExpense = 0.0;

    
    public Employee(int employeeId, String name, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
        totalEmployees++;
        totalSalaryExpense += salary;
    }

    
    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public static int getTotalEmployees() {
        return totalEmployees;
    }

    public static double getTotalSalaryExpense() {
        return totalSalaryExpense;
    }

  
    public void updateSalary(double newSalary) {
        totalSalaryExpense -= salary; 
        totalSalaryExpense += newSalary; 
        this.salary = newSalary;
    }

  
    public static void applyRaise(double percentage) {
        double raiseAmount = totalSalaryExpense * (percentage / 100);
        totalSalaryExpense += raiseAmount;
    }

   
    public static double calculateTotalSalaryExpense() {
        return totalSalaryExpense;
    }

    
    @Override
    public String toString() {
        return "Employee ID: " + employeeId + ", Name: " + name + ", Salary: $" + salary;
    }

    
    public static void main(String[] args) {
      
        Employee emp1 = new Employee(1001, "Michel", 50000.0);
        Employee emp2 = new Employee(1002, "David", 60000.0);

        
        Employee.applyRaise(25);

      
        emp1.updateSalary(75000.0);

  
        System.out.println("Total Employees: " + Employee.getTotalEmployees());
        System.out.println("Total Salary Expense: $" + Employee.calculateTotalSalaryExpense());

 
        System.out.println(emp1);
        System.out.println(emp2);
    }
}