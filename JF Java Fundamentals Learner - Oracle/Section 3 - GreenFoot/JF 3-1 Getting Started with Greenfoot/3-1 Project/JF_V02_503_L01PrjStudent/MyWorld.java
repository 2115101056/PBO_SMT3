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
     * Ngakan Gde Satria Abirama_2115101056
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);

        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Wall wall = new Wall();
        addObject(wall,52,168);
        Wall wall2 = new Wall();
        addObject(wall2,159,169);
        Wall wall3 = new Wall();
        addObject(wall3,262,168);
        wall3.setLocation(293,174);
        wall3.setLocation(296,168);
        Wall wall4 = new Wall();
        addObject(wall4,367,169);
        Block block = new Block();
        addObject(block,590,162);
        wall4.setLocation(428,307);
        block.setLocation(378,161);
        block.setLocation(379,161);
        wall4.setLocation(721,172);
        wall4.setLocation(721,172);
        wall4.setLocation(717,155);
        block.setLocation(633,168);
        Robor robor = new Robor();
        addObject(robor,97,48);
        Home home = new Home();
        addObject(home,721,506);
        Pizza pizza = new Pizza();
        addObject(pizza,273,60);
        Pizza pizza2 = new Pizza();
        addObject(pizza2,483,308);
        Pizza pizza3 = new Pizza();
        addObject(pizza3,701,321);
    }
}
