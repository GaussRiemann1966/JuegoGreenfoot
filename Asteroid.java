import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Asteroid here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Asteroid extends Actor
{
    GifImage asteroides = new GifImage("asteroide.gif");
    /**
     * Act - do whatever the Asteroid wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act(){
        getImage().scale(50,50);
        setImage(asteroides.getCurrentImage());
        setLocation(getX()-2,getY());
    }
    public Asteroid() {
        getImage().scale(100,100);   
    }
}
