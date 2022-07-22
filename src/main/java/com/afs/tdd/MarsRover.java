package com.afs.tdd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MarsRover {

    private int xLocation;
    private int yLocation;
    private final Direction direction;

    public MarsRover(int xLocation, int yLocation, String direction) {
        this.xLocation = xLocation;
        this.yLocation = yLocation;
        this.direction = new Direction(direction);
    }

    public void executeCommand(String command) {
        char[] commandList = command.toCharArray();
        for (char theCommand : commandList) {
            switch (theCommand) {
                case 'M':
                    this.move();
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

    private void move() {
        switch (this.direction.getDirection()) {
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

    public String getDirection() {
        return this.direction.getDirection();
    }

    public int getxLocation() {
        return xLocation;
    }

    public int getyLocation() {
        return yLocation;
    }

}
