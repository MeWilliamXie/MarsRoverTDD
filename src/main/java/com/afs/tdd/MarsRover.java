package com.afs.tdd;

public class MarsRover {

    private final Location location;
    private final Direction direction;

    public MarsRover(int xLocation, int yLocation, String direction) {
        this.location = new Location(xLocation, yLocation);
        this.direction = new Direction(direction);
    }

    public void executeCommand(String command) {
        char[] commandList = command.toCharArray();
        for (char theCommand : commandList) {
            ManageOneCommand(theCommand);
        }
    }

    private void ManageOneCommand(char theCommand){
        switch (theCommand) {
            case CommandImpl.COMMAND_MOVE:
                this.location.move(this.direction);
                break;
            case CommandImpl.COMMAND_LEFT:
                this.direction.turnLeft();
                break;
            case CommandImpl.COMMAND_RIGHT:
                this.direction.turnRight();
                break;
            case CommandImpl.COMMAND_BACK:
                this.direction.turnBack();
                break;
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
