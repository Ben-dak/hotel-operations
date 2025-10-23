package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test
    void testCheckIn() { // This is the object under test
        // Room should be occupied and dirty
        // Arrange
        Room room1 = new Room();
        // new room instance is unoccupied

        // Act - use what I declared and get the result (can rename actual)
        boolean actual = room1.checkIn();

        // Assert
        boolean expected = true;
        assertTrue(actual);
        assertTrue(room1.dirty);
        assertTrue(room1.occupied);
    }

    @Test
    void testCheckOut() { // This is the object under test
        // A new room starts not occupied (False) and not dirty (false)
        // Arrange
        Room room2 = new Room();
        // Act - Try to check out a room that isn't occupied
        boolean actual = room2.checkOut();
        // Assert - verify results
        // Since the room wasn't occupied checkOut() should return false
        assertFalse(actual);
        // The room should not be dirty if unoccupied (someone can check it out)
        assertFalse(room2.dirty);
        // The room should not be occupied (they checked out)
        assertFalse(room2.occupied);
    }

    @Test
    void cleanRoom() {
        // Arrange - needs to be dirty
        Room room3 = new Room();
        room3.dirty = true; // to show it needs cleaning
        // Act - doing
        boolean actual = room3.cleanRoom();
        // Assert - clean succeed/true
        assertTrue(actual);
        // to show that the room is not dirty now
        assertFalse(!room3.dirty);
    }
}