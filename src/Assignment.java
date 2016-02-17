
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fostp4040
 */
public class Assignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    City Kitchener = new City();
    
        Robot karel = new Robot(Kitchener, 1, 5, Direction.NORTH);
        new Wall(Kitchener, 1, 5, Direction.NORTH);
        
    if(karel.getAvenue() > 0){
        karel.move();
    }
        else{
        karel.turnLeft();
    }
    }  
}
