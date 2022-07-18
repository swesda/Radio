package ru.netology.Radio;

public class Radio {

    private int currentVolume;
    private int currentStation;
    private int maxStation = 9;
    private int minStation = 0;

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

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < minStation) {
            return;
        }
        if (newCurrentStation > maxStation) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void increaseStation() {
        if (currentStation == maxStation) {
            currentStation = minStation;
        } else currentStation++;

    }

    public void decreaseStation() {
        if (currentStation == minStation) {
            currentStation = maxStation;
        } else currentStation--;
        }
}