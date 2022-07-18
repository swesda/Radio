package ru.netology.Radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldUpsetCurrentVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(12);

        int expected = 0;
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

        rad.setCurrentVolume(9);

        int expected = 9;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseCurrentVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(8);
        rad.increaseVolume();

        int expected = 9;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void notShouldIncreaseCurrentVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(10);
        rad.increaseVolume();

        int expected = 10;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseCurrentVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(9);
        rad.decreaseVolume();

        int expected = 8;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void notShouldDecreaseCurrentVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(0);
        rad.decreaseVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldUpCurrentStation() {
        Radio rad = new Radio();

        rad.setCurrentStation(12);

        int expected = 0;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldLowCurrentStation() {
        Radio rad = new Radio();

        rad.setCurrentStation(-2);

        int expected = 0;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentStation() {
        Radio rad = new Radio();

        rad.setCurrentStation(0);

        int expected = 0;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetIncreaseStation() {
        Radio rad = new Radio();

        rad.setCurrentStation(8);
        rad.increaseStation();

        int expected = 9;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void notShouldSetIncreaseStation() {
        Radio rad = new Radio();

        rad.setCurrentStation(9);
        rad.increaseStation();

        int expected = 0;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldSetDecreaseStation() {
        Radio rad = new Radio();

        rad.setCurrentStation(4);
        rad.decreaseStation();

        int expected = 3;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void notShouldSetDecreaseStation() {
        Radio rad = new Radio();

        rad.setCurrentStation(0);
        rad.decreaseStation();

        int expected = 9;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
}
