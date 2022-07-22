package com.afs.tdd;

import java.util.Arrays;
import java.util.List;

public class Direction {
    private static final List<String> directionList = Arrays.asList(
            DirectionImpl.DIRECTION_NORTH,
            DirectionImpl.DIRECTION_EAST,
            DirectionImpl.DIRECTION_SOUTH,
            DirectionImpl.DIRECTION_WEST
    );

    private int directionIndex;

    Direction(String direction) {
        this.directionIndex = directionList.indexOf(direction);
    }

    public String getDisplay() {
        return directionList.get(this.directionIndex);
    }

    public void turnLeft() {
        this.directionIndex = (this.directionIndex + 3) % 4;
    }

    public void turnRight() {
        this.directionIndex = (this.directionIndex + 1) % 4;
    }

    public void turnBack(){
        this.directionIndex = (this.directionIndex + 2) % 4;
    }

}
