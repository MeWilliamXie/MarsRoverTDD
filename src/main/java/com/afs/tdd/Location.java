package com.afs.tdd;

public class Location {
    private int xLocation;
    private int yLocation;
    public Location(int xLocation, int yLocation) {
        this.xLocation = xLocation;
        this.yLocation = yLocation;
    }

    public int getXLocation() {
        return this.xLocation;
    }

    public int getYLocation() {
        return this.yLocation;
    }

    public void move(Direction direction){

        switch (direction.getDisplay()) {
            case "N":
                this.yLocation++;
                break;
            case "E":
                this.xLocation++;
                break;
            case "S":
                this.yLocation--;
                break;
            case "W":
                this.xLocation--;
                break;
        }
    }
}
