package ru.netology.Radio;

public class Radio {
    private int minVolume = 0;
    private int maxVolume = 10;
    private int currentVolume;
    private int currentStation;
    private int minStation = 0;
    private int maxStation = 9;

    public Radio(int maxStation, int minStation) {
        this.minStation = minStation;
        this.maxStation = maxStation;
    }

    public Radio(int size) {
        maxStation = minStation + size;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume (int minVolume) {
        this.minVolume = minVolume;
    }

    public int getMaxVolume () {
        return maxVolume;
    }

    public void setMaxVolume (int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
       if (currentVolume >= maxVolume) {
           this.currentVolume = maxVolume;
           return;
       }
       if (currentVolume <= minVolume) {
           this.currentVolume = minVolume;
           return;
       }
       this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }

    public int getMinStation() {
        return minStation;
    }

    public void setMinStation(int minStation) {
        this.minStation = minStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public void setMaxStation(int maxStation) {
        this.maxStation = maxStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            this.currentStation = maxStation;
            return;
        }
        if (currentStation < minStation) {
            this.currentStation = minStation;
            return;
        }
        this.currentStation = currentStation;
    }

    public void increaseStation() {
        if (currentStation < maxStation) {
            currentStation++;
        } else {
            currentStation = minStation;
        }
    }

    public void decreaseStation() {
        if (currentStation > minStation) {
            currentStation--;
        } else {
            currentStation = maxStation;
        }
    }
}