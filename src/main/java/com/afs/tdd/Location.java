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
            case DirectionImpl.DIRECTION_NORTH:
                this.yLocation++;
                break;
            case DirectionImpl.DIRECTION_EAST:
                this.xLocation++;
                break;
            case DirectionImpl.DIRECTION_SOUTH:
                this.yLocation--;
                break;
            case DirectionImpl.DIRECTION_WEST:
                this.xLocation--;
                break;
        }
    }
}
