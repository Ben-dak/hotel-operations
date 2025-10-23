package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void getRegularHours_less_than_40() {
        // What if an employee worked 32.20 hours
        // Will need to set the value of hours, call regular hours to check my method
        // then compare to see if it accepts 32.30 as regular hours

        // ARRANGE
        Employee ee1 = new Employee(); // Creates a new Employee object

        ee1.setHoursWorked(32.20); // stores the number 32.30 in the object’s field hoursWorked
        //After this line executes, ee1 now holds that data - which can be used getRegularHours()

        // ACT
        // The line below calls getRegularHours() method on the Employee object named ee1
        // then stores whatever value that method returns (see below comment) into a variable named actual
        // (getRegularHours returns hoursWorked if this.hoursWorked <= 40)
        double actual = ee1.getRegularHours();
        // Since the employee worked less than or qual to 40 hours getRegularHours returns 32.20

        // ASSERT
        // This means I expect the method getRegularHours() to return 32.20 due to my logic above.
        double expected = 32.20;
        // Compare the expected value to the actual result
        assertEquals(expected, actual);
    }

    @Test
    void getOvertimeHours() {
        // Arrange
        // Act
        // Assert
    }

    @Test
    void getTotalPay() {
        // Arrange
        // Act
        // Assert
    }
}