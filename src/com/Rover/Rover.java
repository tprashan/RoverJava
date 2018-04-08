package com.Rover;

import com.Rover.constants.Direction;

public class Rover {

    private  Integer x_coard;
    private  Integer y_coard;
    private Integer facing = Direction.N;

    public Rover(Integer x_coard, Integer y_coard, Integer facing) {
        this.x_coard = x_coard;
        this.y_coard = y_coard;
        this.facing = facing;
    }

    public void process(String commands) {
        commands = commands.toUpperCase();
        for (int index = 0; index < commands.length(); index ++ ) {
            command(commands.charAt(index));
        }
    }

    private void command(Character instruction) {
        if (instruction.equals('L')) {
            turnLeft();
        } else if (instruction.equals('R')) {
            turnRight();
        } else if (instruction.equals('M')) {
            move();
        } else {
            System.out.println("Speak in Mars language, please!");
            System.exit(0);
        }
    }

    private void move() {
        if (facing == Direction.N) {
            y_coard++;
        } else if (facing == Direction.E) {
            x_coard++;
        } else if (facing == Direction.S) {
            y_coard--;
        } else if (facing == Direction.W) {
           x_coard--;
        }
    }

    private void turnLeft() {
        facing = (facing - 1) < Direction.N ? Direction.W : facing - 1;
    }

    private void turnRight() {
        facing = (facing  + 1) > Direction.W ? Direction.N : facing  + 1;
    }

    public void printPosition(){
        new PrintCoordinates().printPosition(x_coard, y_coard, facing);
    }
}