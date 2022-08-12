package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldSetStation() {
        Radio station = new Radio();

        station.setCurrentStation(5);
        int expected = 5;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    public void shouldSetStationAndSize() {
        Radio station = new Radio(11);

        station.setCurrentStation(10);
        int expected = 10;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNotSetStation() {
        Radio station = new Radio();

        station.setCurrentStation(5);
        station.setCurrentStation(255);
        int expected = 5;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldNotSetStationMinus() {
        Radio station = new Radio();

        station.setCurrentStation(5);
        station.setCurrentStation(-255);
        int expected = 5;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSwitchNextStation() {
        Radio station = new Radio();

        station.setCurrentStation(5);
        station.nextStation();
        int expected = 6;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchPrevStation() {
        Radio station = new Radio();

        station.setCurrentStation(5);
        station.prevStation();
        int expected = 4;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCycleUpStation() {
        Radio station = new Radio();

        station.setCurrentStation(9);
        station.nextStation();
        int expected = 0;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCycleDownStation() {
        Radio station = new Radio();

        station.setCurrentStation(0);
        station.prevStation();
        int expected = 9;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    public void shouldCycleUpSettledStation() {
        Radio station = new Radio(100);

        station.setCurrentStation(99);
        station.nextStation();
        int expected = 0;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCycleSettledDownStation() {
        Radio station = new Radio(100);

        station.setCurrentStation(0);
        station.prevStation();
        int expected = 99;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetVolume() {
        Radio volume = new Radio();

        volume.setCurrentVolume(5);
        int expected = 5;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolume() {
        Radio volume = new Radio();

        volume.setCurrentVolume(5);
        volume.setCurrentVolume(255);
        int expected = 5;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldNotSetVolumeMinus() {
        Radio volume = new Radio();

        volume.setCurrentVolume(5);
        volume.setCurrentVolume(-255);
        int expected = 5;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldIncreaseVolume() {
        Radio volume = new Radio();

        volume.setCurrentVolume(5);
        volume.increaseVolume();
        int expected = 6;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio volume = new Radio();

        volume.setCurrentVolume(5);
        volume.decreaseVolume();
        int expected = 4;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseVolume() {
        Radio volume = new Radio();

        volume.setCurrentVolume(100);
        volume.increaseVolume();
        int expected = 100;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotDecreaseVolume() {
        Radio volume = new Radio();

        volume.setCurrentVolume(0);
        volume.decreaseVolume();
        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
