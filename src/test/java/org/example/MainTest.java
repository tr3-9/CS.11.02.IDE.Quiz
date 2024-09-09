package org.example;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void circleArea() {
        assertEquals(78.54, Main.circleArea(5));
        assertEquals(254.47, Main.circleArea(9));
    }

    @org.junit.jupiter.api.Test
    void circleCircum() {
        assertEquals(31.42, Main.circleCircum(5));
        assertEquals(56.55, Main.circleCircum(9));
    }

    @org.junit.jupiter.api.Test
    void circleInfo() {
        String expected1 = "Radius: 5" + "\nCircumference: 31.42" + "\nArea: 78.54";
        assertEquals(expected1, Main.circleInfo(5));

        String expected2 = "Radius: 9" + "\nCircumference: 56.55" + "\nArea: 254.47";
        assertEquals(expected2, Main.circleInfo(9));
    }

    @org.junit.jupiter.api.Test
    void minutesToHoursMinutes() {
        assertEquals("4 hours and 27 minutes", Main.minutesToHoursMinutes(267));
        assertEquals("8 hours and 32 minutes", Main.minutesToHoursMinutes(512));
    }

    @org.junit.jupiter.api.Test
    void twentyFourToTwelve() {
        assertEquals("1:43 pm", Main.twentyFourToTwelve("13:43"));
        assertEquals("2:15 pm", Main.twentyFourToTwelve("14:15"));
    }

    @org.junit.jupiter.api.Test
    void distanceBetweenTwoPoints() {
        assertEquals(3.61, Main.distanceBetweenTwoPoints(3,4,1,7));
        assertEquals(10.0, Main.distanceBetweenTwoPoints(7,9,1,1));
    }

    @org.junit.jupiter.api.Test
    void fahrenheitToCelsius() {
        assertEquals(37.78, Main.fahrenheitToCelsius(100));
        assertEquals(25.56, Main.fahrenheitToCelsius(78));
    }

    @org.junit.jupiter.api.Test
    void celsiusToFahrenheit() {
        assertEquals(95.0, Main.celsiusToFahrenheit(35));
        assertEquals(53.6, Main.celsiusToFahrenheit(12));
    }
}