import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class Ship here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Ship extends Actor
{
    double grav = 0.0;
    double grav1 = 0.35;
    double boost= 0.70;
    GifImage ship = new GifImage("ship.gif");
    /**
     * Act - do whatever the Ship wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        getImage().scale(80,50);
        setImage(ship.getCurrentImage());
        if (Greenfoot.isKeyDown​("w")==true){
            grav = -3;  
        }
        else if (grav>1){
            setRotation(30);
        }
        else if(grav<-1){
            setRotation(-30);
        }
        else if(grav>= -1.5 && grav<=1.5){
            setRotation(0);
        }
        /*if (getY() > getWorld().getHeight()){
            GameoverC gameover = new GameoverC();
            getWorld().addObject(gameover,300,225);
            Greenfoot.stop();
        }
        if (getY() < 0){
            GameoverC gameover = new GameoverC();
            getWorld().addObject(gameover,300,225);
            Greenfoot.stop();
        }*/
        setLocation(getX(), (int)(getY() + grav));
        
        if (Greenfoot.isKeyDown​("space")==true){
            grav = (grav-boost); 
        }
        grav += grav1;
    }
    public Ship(){
        getImage().scale(80,50);         
    }
}

