package ru.netology;

public class Radio {

    private int currentStation;
    private int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentStation(int newStation) {
        if (newStation >= 0 & newStation <= 9) {
            currentStation = newStation;
        }
    }

    public void nextStation() {
        if (currentStation == 9) {
            setCurrentStation(0);
        }
        else {
            setCurrentStation(currentStation + 1);
        }
    }

    public void prevStation() {
        if (currentStation == 0) {
            setCurrentStation(9);
        }
        else {
            setCurrentStation(currentStation - 1);
        }
    }

    public void setCurrentVolume(int newVolume) {
        if (newVolume >= 0 & newVolume <= 10) {
            currentVolume = newVolume;
        }
    }

    public void increaseVolume() {
        if (currentVolume != 10) {
            setCurrentVolume(currentVolume + 1);
        }
    }

    public void decreaseVolume() {
        if (currentVolume != 0) {
            setCurrentVolume(currentVolume - 1);
        }
    }
}

