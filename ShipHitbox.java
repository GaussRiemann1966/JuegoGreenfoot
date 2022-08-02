import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class ShipHitbox here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class ShipHitbox extends Actor
{

    /**
     * Act - do whatever the ShipHitbox wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (getY() > getWorld().getHeight()){
            GameoverC gameover = new GameoverC();
            getWorld().addObject(gameover,300,225);
            Greenfoot.stop();
        }
        if (getY() < 0){
            GameoverC gameover = new GameoverC();
            getWorld().addObject(gameover,300,225);
            Greenfoot.stop();
        }
        if(getOneIntersectingObject​(Asteroid.class) != null){
            Explosion explosion = new Explosion();
            Ship rocket = getWorld().getObjects(Ship.class).get(0);
            getWorld().addObject(explosion,rocket.getX(),rocket.getY());
            GameoverC gameover = new GameoverC();
            getWorld().addObject(gameover,300,225);
            Greenfoot.stop();
        }
        Ship rocket = getWorld().getObjects(Ship.class).get(0);
        //Ship2 rocket2=getWorld().getObjects(Ship2.class).get(0);
        setLocation(rocket.getX(), rocket.getY());
        //setLocation(rocket2.getX(), rocket2.getY());
        
        
    }
    public ShipHitbox(){
        GreenfootImage imageHit = new GreenfootImage(60,35);
        setImage(imageHit);
    }
}

