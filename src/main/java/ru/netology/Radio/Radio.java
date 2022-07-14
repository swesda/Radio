package ru.netology.Radio;

public class Radio {

    private int currentVolume;
    private int currentStation;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 10) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            currentStation = 9;
        }
        if (newCurrentStation > 9) {
            currentStation = 0;
        }
        currentStation = newCurrentStation;
        return newCurrentStation;
    }

    public void increaseStation() {
        if (currentStation < 9) {
            currentStation = currentStation + 1;
        }
    }

    public void decreaseStation() {
        if (currentStation > 0) {
            currentStation = currentStation - 1;
        }
    }
}