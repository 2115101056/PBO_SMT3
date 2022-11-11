import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Robot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Robot extends Actor
{
    /**
     * Act - do whatever the Robot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        robotMovement();
        detectWallCollision();
        detectBlockCollision();
        
        
        
    }
    public void robotMovement()
    {
        //moveRobot
    }
    public void detectWallCollision()
    {
        //code dimana ketika robot menabrak wall
        
        if(isTouching(Wall.class))
        {
            setLocation(0,getY());
        }
    }
    public void detectBlockCollision()
    {
        //code dimana robot akan kembali ke awal setelah menabrak 
        if(isTouching(Block.class))
        {
            setLocation(0,getY());
        }
    }
}
