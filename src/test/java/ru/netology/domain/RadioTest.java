package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void nextStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(5);

        rad.next();

        int expected = 6;
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void nextStationToZero() {
        Radio rad = new Radio();
        rad.setCurrentStation(10);

        rad.next();

        int expected = 0;
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void prevStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(8);

        rad.prev();

        int expected = 7;
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void prevStationToNine() {
        Radio rad = new Radio();
        rad.setCurrentStation(0);

        rad.prev();

        int expected = 9;
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void selectStation() {
        Radio rad = new Radio();
        rad.stationSelect(7);

        int expected = 7;
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void selectStationMoreThanNine() {
        Radio rad = new Radio();
        rad.stationSelect(10);

        int expected = 0;
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void selectStationLessThanZero() {
        Radio rad = new Radio();
        rad.stationSelect(-1);

        int expected = 0;
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void increaseVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(4);

        rad.increaseVolume();

        int expected = 5;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void increaseVolumeToTheMax() {
        Radio rad = new Radio();
        rad.setCurrentVolume(100);

        rad.increaseVolume();

        int expected = 100;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void decreaseVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(7);

        rad.decreaseVolume();

        int expected = 6;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void decreaseVolumeToTheMin() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);

        rad.decreaseVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void setCustomStation() {
        int amountStation = 30;
        Radio rad = new Radio(amountStation);
        int expectedStation = 15;
        rad.setCurrentStation(15);

        assertEquals(expectedStation, rad.getCurrentStation());
    }
}