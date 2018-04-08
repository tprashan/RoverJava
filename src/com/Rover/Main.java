package com.Rover;

import com.Rover.constants.Direction;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Rover rover = new Rover(0, 0, Direction.N);

        System.out.println("Give Command to Rover:");
        Scanner sc  = new Scanner(System.in);
        String command = sc.nextLine();
        rover.process(command);
        rover.printPosition();
    }
}
