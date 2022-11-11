import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
        
        Robot robot = new Robot();
        addObject(robot,60,85);
        
        Block block = new Block();
        addObject(block,667,200);
        
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Robot robot = new Robot();
        addObject(robot,54,52);
        Wall wall = new Wall();
        addObject(wall,54,157);
        robot.setLocation(51,40);
        wall.setLocation(60,124);
        Block block = new Block();
        addObject(block,428,124);
        Wall wall2 = new Wall();
        addObject(wall2,167,130);
        Home home = new Home();
        addObject(home,538,332);
        wall.setLocation(86,44);
        wall.setLocation(76,116);
        wall2.setLocation(169,127);
    }
}
