package ru.netology.Radio;

import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

public class RadioTest {

    @Test
    public void shouldUpsetCurrentVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(12);

        int expected = 10;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldLowCurrentVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(-2);

        int expected = 0;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(5);

        int expected = 5;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseCurrentVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(3);
        rad.increaseVolume();

        int expected = 4;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseCurrentVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(3);
        rad.decreaseVolume();

        int expected = 2;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldUpCurrentStation() {
        Radio rad = new Radio();

        rad.setCurrentVolume(12);

        int expected = 2;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldLowCurrentStation() {
        Radio rad = new Radio();

        rad.setCurrentVolume(-2);

        int expected = 8;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentStation() {
        Radio rad = new Radio();

        rad.setCurrentVolume(6);

        int expected = 6;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}
