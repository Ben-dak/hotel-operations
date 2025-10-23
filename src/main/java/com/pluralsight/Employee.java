package com.pluralsight;

import java.time.LocalTime;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private boolean atWork;

    public Employee(int employeeId, String name, String department, double payRate, int hoursWorked, boolean atWork) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
        this.atWork = atWork;
    }

    public Employee() {
    }

    // getters and setters
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public boolean isAtWork() {
        return atWork;
    }

    public void setAtWork(boolean atWork) {
        this.atWork = atWork;
    }

    public double getRegularHours() {
        if (this.hoursWorked <= 40){
            return this.hoursWorked;
        }else {
            return 40;
        }
    }

    public double getOvertimeHours(){
        if (this.hoursWorked > 40){
            return this.hoursWorked - 40;
        }else {
            return 0;
        }
    }
    // pay rate and hours worked
    // whether they worked overtime or not
    // regular pay (getRegularHours x payrate) + overtime pay (getRegularHours x payrate) + (overtime hours * payrate * 1.5)
    public double getTotalPay() {
        return (getRegularHours() * this.payRate) + (getOvertimeHours() * this.payRate * 1.5);
    }

    public boolean punchIn() {
        if(this.atWork) {
            System.out.println("already at work, cant punch in.");
            return false;

        }
        else {
            System.out.println("Punching in at: " + LocalTime.now());
            this.atWork = true;
            return true;
        }
    }
    public boolean punchOut() {
        if (!this.atWork) {
            System.out.println("Not at work, can't punch out.");
            return false;
        }
        else {
            System.out.println("Punching out at: " + LocalTime.now());
            this.atWork = false;
            return true;
        }
    }

    public boolean punchTimeCard() {
        if(this.atWork) {
            this.punchOut();
        }
        else {
            this.punchIn();
        }
        return false;
    }

}
