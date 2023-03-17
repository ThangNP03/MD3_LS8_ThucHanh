package rikkeiAcaademy.testRefactoring;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import rikkeiAcaademy.Cylinder;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCylinder {
    @Test
    @DisplayName("Testing getVolume (0,0)")
    void testGetVolume(){
        int radius = 0;
        int height = 0;
        double expected = 0;

        double result = Cylinder.getVolume(radius,height);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("Test getVolume(1,2)")
    void testGetVolume1and2() {
        int radius = 1;
        int height = 2;
        double expected = 18.84955592153876;

        double result = Cylinder.getVolume(radius, height);
        assertEquals(expected, result);
    }
}
