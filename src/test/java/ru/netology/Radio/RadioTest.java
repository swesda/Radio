package ru.netology.Radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldUpsetCurrentVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(12);
        rad.setMaxVolume(10);
        rad.setMinVolume(0);

        int expected = 10;

        Assertions.assertEquals(expected, rad.getCurrentVolume());
    }

    @Test
    public void shouldLowCurrentVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(-2);
        rad.setMaxVolume(10);
        rad.setMinVolume(0);

        int expected = 0;

        Assertions.assertEquals(expected, rad.getCurrentVolume());
    }

    @Test
    public void shouldSetCurrentVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(5);
        rad.setMaxVolume(10);
        rad.setMinVolume(0);

        int expected = 5;

        Assertions.assertEquals(expected, rad.getCurrentVolume());
    }

    @Test
    public void shouldSetCurrentVolumeMin() {
        Radio rad = new Radio();

        rad.setCurrentVolume(0);
        rad.setMaxVolume(10);
        rad.setMinVolume(0);

        int expected = 0;

        Assertions.assertEquals(expected, rad.getCurrentVolume());
    }

    @Test
    public void shouldSetCurrentVolumeMax() {
        Radio rad = new Radio();

        rad.setCurrentVolume(10);
        rad.setMaxVolume(10);
        rad.setMinVolume(0);

        int expected = 10;

        Assertions.assertEquals(expected, rad.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseCurrentVolume() {
        Radio rad = new Radio();

        rad.setMaxVolume(10);
        rad.setMinVolume(0);
        rad.setCurrentVolume(3);
        rad.increaseVolume();

        int expected = 4;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, rad.getCurrentVolume());
    }

    @Test
    public void ShouldIncreaseCurrentVolumeMax() {
        Radio rad = new Radio();

        rad.setMinVolume(0);
        rad.setMaxVolume(10);
        rad.setCurrentVolume(10);
        rad.increaseVolume();

        int expected = 10;

        Assertions.assertEquals(expected, rad.getMaxVolume());
    }

    @Test
    public void ShouldIncreaseCurrentVolumeMin() {
        Radio rad = new Radio();

        rad.setMinVolume(0);
        rad.setMaxVolume(10);
        rad.setCurrentVolume(0);
        rad.increaseVolume();

        int expected = 0;

        Assertions.assertEquals(expected, rad.getMinVolume());
    }

    @Test
    public void shouldDecreaseCurrentVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(3);
        rad.decreaseVolume();
        rad.setMaxVolume(10);
        rad.setMinVolume(0);

        int expected = 2;

        Assertions.assertEquals(expected, rad.getCurrentVolume());
    }

    @Test
    public void ShouldDecreaseCurrentVolumeMax() {
        Radio rad = new Radio();

        rad.setCurrentVolume(10);
        rad.decreaseVolume();
        rad.setMaxVolume(10);
        rad.setMinVolume(0);

        int expected = 10;

        Assertions.assertEquals(expected, rad.getMaxVolume());
    }

    @Test
    public void ShouldDecreaseCurrentVolumeMin() {
        Radio rad = new Radio();

        rad.setCurrentVolume(0);
        rad.decreaseVolume();
        rad.setMaxVolume(10);
        rad.setMinVolume(0);

        int expected = 0;

        Assertions.assertEquals(expected, rad.getMinVolume());
    }

    @Test
    public void shouldUpCurrentStation() {
        Radio rad = new Radio();

        rad.setCurrentStation(12);
        rad.setMaxStation(9);
        rad.setMinStation(0);

        int expected = 9;

        Assertions.assertEquals(expected, rad.getCurrentStation());
    }

    @Test
    public void shouldLowCurrentStation() {
        Radio rad = new Radio();

        rad.setCurrentStation(-2);
        rad.setMaxStation(9);
        rad.setMinStation(0);

        int expected = 0;

        Assertions.assertEquals(expected, rad.getCurrentStation());
    }

    @Test
    public void shouldSetCurrentStation() {
        Radio rad = new Radio();

        rad.setCurrentStation(6);
        rad.setMaxStation(9);
        rad.setMinStation(0);

        int expected = 6;

        Assertions.assertEquals(expected, rad.getCurrentStation());
    }

    @Test
    public void shouldSetIncreaseStation() {
        Radio rad = new Radio();

        rad.setCurrentStation(4);
        rad.increaseStation();
        rad.setMaxStation(9);
        rad.setMinStation(0);

        int expected = 5;

        Assertions.assertEquals(expected, rad.getCurrentStation());
    }

    @Test
    public void notShouldSetIncreaseStation() {
        Radio rad = new Radio();

        rad.setCurrentStation(9);
        rad.increaseStation();
        rad.setMaxStation(9);
        rad.setMinStation(0);

        int expected = 0;

        Assertions.assertEquals(expected, rad.getCurrentStation());
    }

    @Test
    public void ShouldSetDecreaseStation() {
        Radio rad = new Radio();

        rad.setCurrentStation(4);
        rad.decreaseStation();
        rad.setMaxStation(9);
        rad.setMinStation(0);

        int expected = 3;

        Assertions.assertEquals(expected, rad.getCurrentStation());
    }

    @Test
    public void notShouldSetDecreaseStation() {
        Radio rad = new Radio();

        rad.setCurrentStation(0);
        rad.decreaseStation();
        rad.setMaxStation(9);
        rad.setMinStation(0);

        int expected = 9;

        Assertions.assertEquals(expected, rad.getCurrentStation());
    }
}
