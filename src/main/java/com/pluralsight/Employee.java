package com.pluralsight;

import java.time.LocalTime;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private int hoursWorked;
    private boolean atWork;

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
