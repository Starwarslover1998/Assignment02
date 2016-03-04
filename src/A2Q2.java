
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fostp4040
 */
public class A2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City Kitchener = new City();
        
        Robot karel = new Robot (Kitchener, 1, 1, Direction.EAST);
        new Wall(Kitchener, 1, 1, Direction.EAST);
        new Wall(Kitchener, 1, 1, Direction.SOUTH);
        new Wall(Kitchener, 1, 2, Direction.EAST);
        new Wall(Kitchener, 1, 2, Direction.SOUTH);
        new Wall(Kitchener, 1, 3, Direction.SOUTH);
        new Wall(Kitchener, 1, 4, Direction.EAST);
        new Wall(Kitchener, 1, 4, Direction.SOUTH);
        new Wall(Kitchener, 1, 5, Direction.SOUTH);
        new Wall(Kitchener, 1, 6, Direction.SOUTH);
        new Wall(Kitchener, 1, 7, Direction.SOUTH);
        new Wall(Kitchener, 1, 7, Direction.EAST);
        new Wall(Kitchener, 1, 8, Direction.SOUTH);
        new Wall(Kitchener, 1, 9, Direction.SOUTH);
        new Thing(Kitchener, 1, 9);
        
        if(karel.frontIsClear()){
            karel.move();
         } else {
            karel.turnLeft();
    }
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        
        if(karel.frontIsClear()){
            karel.move();
         } else {
            karel.turnLeft();
    }
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        if(karel.frontIsClear()){
            karel.move();
         } else {
            karel.turnLeft();
    }
        if(karel.frontIsClear()){
            karel.move();
         } else {
            karel.turnLeft();
    }
        if(karel.frontIsClear()){
            karel.move();
         } else {
            karel.turnLeft();
    }
        if(karel.frontIsClear()){
            karel.move();
         } else {
            karel.turnLeft();
    }
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        if(karel.frontIsClear()){
            karel.move();
         } else {
            karel.turnLeft();
    }
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        if(karel.frontIsClear()){
            karel.move();
         } else {
            karel.turnLeft();
    }
        if(karel.frontIsClear()){
            karel.move();
         } else {
            karel.turnLeft();
    }
        if(karel.frontIsClear()){
            karel.move();
         } else {
            karel.turnLeft();
    }
        if(karel.frontIsClear()){
            karel.move();
         } else {
            karel.turnLeft();
    }
        if(karel.frontIsClear()){
            karel.move();
         } else {
            karel.turnLeft();
    }
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        if(karel.frontIsClear()){
            karel.move();
         } else {
            karel.turnLeft();
    }
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        if(karel.frontIsClear()){
            karel.move();
         } else {
            karel.turnLeft();
    }
        if(karel.frontIsClear()){
            karel.move();
         } else {
            karel.turnLeft();
    }
        if(karel.frontIsClear()){
            karel.move();
         } else {
            karel.turnLeft();
    }
        if(karel.frontIsClear()){
            karel.move();
         } else {
            karel.turnLeft();
    }
        if(karel.frontIsClear()){
            karel.move();
         } else {
            karel.turnLeft();
    }
        if(karel.frontIsClear()){
            karel.move();
         } else {
            karel.turnLeft();
    }
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        if(karel.frontIsClear()){
            karel.move();
         } else {
            karel.turnLeft();
    }
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        if(karel.frontIsClear()){
            karel.move();
         } else {
            karel.turnLeft();
    }
        if(karel.frontIsClear()){
            karel.move();
         } else {
            karel.turnLeft();
    }
        if(karel.frontIsClear()){
            karel.move();
         } else {
            karel.turnLeft();
    }
    }
}