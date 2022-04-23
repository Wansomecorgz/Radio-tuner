package ru.netology.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Radio {

    private int currentStation;

    private int minStation = 0;

    private int maxStation = 9;

    private int currentVolume;

    private int minVolume = 0;

    private int maxVolume = 100;

    public Radio(int amountStation) {
        this.maxStation = amountStation - 1;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        this.currentStation = currentStation;
    }

    public void next() {
        this.currentStation = currentStation + 1;
        if (currentStation > maxStation) {
            this.currentStation = minStation;
        }
    }

    public void prev() {
        this.currentStation = currentStation - 1;
        if (currentStation < minStation) {
            this.currentStation = maxStation;
        }
    }

    public void stationSelect(int stationSelect) {
        if (stationSelect < minStation) {
            return;
        }
        if (stationSelect > maxStation) {
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
        if (currentVolume > maxVolume) {
            this.currentVolume = maxVolume;
        }
    }

    public void decreaseVolume() {
        this.currentVolume = currentVolume - 1;
        if (currentVolume < minVolume) {
            this.currentVolume = minVolume;
        }
    }
}
