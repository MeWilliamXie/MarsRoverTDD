package com.afs.tdd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MarsRover {
    private static final String locationFormat = "location: (x: %d, y: %d), direction: %s";
    private static final List<String> directionList = Arrays.asList("N", "E", "S", "W");

    private int xLocation;
    private int yLocation;
    private int directionIndex;

    public MarsRover(int xLocation, int yLocation, String dirction) {
        this.xLocation = xLocation;
        this.yLocation = yLocation;
        this.directionIndex = directionList.indexOf(dirction);
    }

    public void executeCommand(String command) {
        switch (command) {
            case "M":
                this.move();
                break;
            case "L":
                this.turnLeft();
                break;
            case "R":
                this.turnRight();
                break;
        }
    }

    private void move() {
        switch (this.directionIndex) {
            case 0:
                this.yLocation++;
                break;
            case 1:
                this.xLocation++;
                break;
            case 2:
                this.yLocation--;
                break;
            case 3:
                this.xLocation--;
                break;
        }
    }

    private void turnLeft() {
        this.directionIndex = this.directionIndex - 1 >= 0 ? this.directionIndex - 1 : 3;
    }

    private void turnRight() {
        this.directionIndex = this.directionIndex + 1 <= 3 ? this.directionIndex + 1 : 0;
    }


    public String getLocation() {
        return String.format(locationFormat, this.xLocation, this.yLocation, this.getDirection());
    }

    public String getDirection() {
        return directionList.get(this.directionIndex);
    }

//    public int getxLocation() {
//        return xLocation;
//    }
//
//    public int getyLocation() {
//        return yLocation;
//    }

}
