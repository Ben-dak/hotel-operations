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
        ee1.setHoursWorked(32.20); // This value will be used by the method under test
        // ACT
        // Calls getRegularHours() to see how many hours the method reports as regular hours
        double actual = ee1.getRegularHours();
        // Assert
        // Since the employee worked less than 40 hours it returns 32.20
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