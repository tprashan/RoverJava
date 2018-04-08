package com.Rover;

public class PrintCoordinates {

    private Boolean printLocationOfRover(int x, int y, int x_cord, int y_cord) {
        if(x==x_cord && y==y_cord){
            System.out.print("Rv");
            return true;
        }
        return false;
    }

    public void showCoordinates(Integer x_coard, Integer y_coard){
        Boolean findLocation;
        for (int y=5;y>=-5;y--){
            for (int x=-5;x<=5;x++){
                findLocation = printLocationOfRover(x,y,x_coard,y_coard);
                if(x==0 && !findLocation)
                    System.out.print("|");
                if (y==0 && !findLocation)
                    System.out.print("--");
                else if(!findLocation)
                    System.out.print("  ");
            }
            System.out.println();
        }
    }


    public void printPosition(Integer x_coard, Integer y_coard, Integer facing) {
        char dir = 'N';
        if (facing == 1) {
            dir = 'N';
        } else if (facing == 2) {
            dir = 'E';
        } else if (facing == 3) {
            dir = 'S';
        } else if (facing == 4) {
            dir = 'W';
        }
        showCoordinates(x_coard,y_coard);
        System.out.println("(" + x_coard + " " + y_coard + " " + dir + ")");
    }
}
