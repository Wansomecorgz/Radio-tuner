package ru.netology.domain;

public class Radio {

    private int currentStation;

    private int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        this.currentStation = currentStation;
    }

    public void next() {
        this.currentStation = currentStation + 1;
        if (currentStation > 9) {
            this.currentStation = 0;
        }
    }

    public void prev() {
        this.currentStation = currentStation - 1;
        if (currentStation < 0) {
            this.currentStation = 9;
        }
    }

    public void stationSelect(int stationSelect) {
        if (stationSelect < 0) {
            return;
        }
        if (stationSelect > 9) {
            return;
        }
        this.currentStation = stationSelect;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        this.currentVolume = currentVolume + 1;
        if (currentVolume > 10) {
            this.currentVolume = 10;
        }
    }

    public void decreaseVolume() {
        this.currentVolume = currentVolume - 1;
        if (currentVolume < 0) {
            this.currentVolume = 0;
        }
    }
}
