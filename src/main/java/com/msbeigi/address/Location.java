package com.msbeigi.address;

abstract class Location {
    protected int latitude;
    protected int longitude;

    public Location() {
        latitude = 0;
        longitude = 0;
    }

    public Location(int latitude, int longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

}
