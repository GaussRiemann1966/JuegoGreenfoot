import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class Ship2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Ship2 extends Actor
{
    double grav = 0.0;
    double grav1 = 0.35;
    double boost= 0.70;
    GifImage ship2 = new GifImage("ship1.gif");
    /**
     * Act - do whatever the Ship2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        getImage().scale(80,50);
        setImage(ship2.getCurrentImage());
        if (grav>1){
            setRotation(30);
        }
        else if(grav<-1){
            setRotation(-30);
        }
        else if(grav>= -1.5 && grav<=1.5){
            setRotation(0);
        }
        setLocation(getX(), (int)(getY() + grav));
        
        if (Greenfoot.isKeyDown​("w")==true){
            grav = (grav-boost); 
        }
        grav += grav1;
    }
    public Ship2(){
        getImage().scale(80,50);         
    }
}

