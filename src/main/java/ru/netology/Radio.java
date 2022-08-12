package ru.netology;

public class Radio {

    private int maxStation = 9;
    private int currentStation;
    private int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentStation(int newStation) {
        if (newStation >= 0 & newStation <= maxStation) {
            currentStation = newStation;
        }
    }

    public void nextStation() {
        if (currentStation == maxStation) {
            setCurrentStation(0);
        }
        else {
            setCurrentStation(currentStation + 1);
        }
    }

    public void prevStation() {
        if (currentStation == 0) {
            setCurrentStation(maxStation);
        }
        else {
            setCurrentStation(currentStation - 1);
        }
    }

    public void setCurrentVolume(int newVolume) {
        if (newVolume >= 0 & newVolume <= 100) {
            currentVolume = newVolume;
        }
    }

    public void increaseVolume() {
        if (currentVolume != 100) {
            setCurrentVolume(currentVolume + 1);
        }
    }

    public void decreaseVolume() {
        if (currentVolume != 0) {
            setCurrentVolume(currentVolume - 1);
        }
    }

    public Radio(){

    }

    public Radio(int stationsQnt){
        this.maxStation = stationsQnt - 1;
    }
}

