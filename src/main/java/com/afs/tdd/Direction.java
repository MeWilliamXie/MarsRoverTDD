package com.afs.tdd;

import java.util.Arrays;
import java.util.List;

public class Direction {
    private static final List<String> directionList = Arrays.asList("N", "E", "S", "W");
    private int directionIndex;

    Direction(String direction) {
        this.directionIndex = directionList.indexOf(direction);
    }

    public String getDisplay() {
        return directionList.get(this.directionIndex);
    }

    public void turnLeft() {
        this.directionIndex = this.directionIndex - 1 >= 0 ? this.directionIndex - 1 : 3;
    }

    public void turnRight() {
        this.directionIndex = this.directionIndex + 1 <= 3 ? this.directionIndex + 1 : 0;
    }

}
