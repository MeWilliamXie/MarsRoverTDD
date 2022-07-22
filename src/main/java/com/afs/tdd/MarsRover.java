package com.afs.tdd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MarsRover {

    //    private int xLocation;
//    private int yLocation;
    private final Location location;
    private final Direction direction;

    public MarsRover(int xLocation, int yLocation, String direction) {
        this.location = new Location(xLocation, yLocation);
        this.direction = new Direction(direction);
    }

    public void executeCommand(String command) {
        char[] commandList = command.toCharArray();
        for (char theCommand : commandList) {
            switch (theCommand) {
                case 'M':
                    this.location.move(this.direction);
                    break;
                case 'L':
                    this.direction.turnLeft();
                    break;
                case 'R':
                    this.direction.turnRight();
                    break;
            }
        }

    }

    public String getDirection() {
        return this.direction.getDisplay();
    }

    public int getXLocation() {
        return this.location.getXLocation();
    }

    public int getYLocation() {
        return this.location.getYLocation();
    }

}
