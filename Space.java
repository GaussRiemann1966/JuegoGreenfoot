import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Space here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Space extends World
{
    int contador = 0;
    int score1 = 0;
    int primerAste = 370;
    //Score scoreprint = null;
    /**
     * Constructor for objects of class Space.
     * 
     */
    public Space()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false); 
        //Creat a ship
        Ship rocket = new Ship();
        ShipHitbox hitboxRocket = new ShipHitbox();
        //Agregar la hitbox in the same place
        addObject(hitboxRocket,100,200);
        addObject(rocket,100,200);
        
        //Crear y agregar score
        /*scoreprint = new Score();
        scoreprint.setScore(0);
        addObject(scoreprint,100,350);*/
    }
    public void act(){
        //addAsteroid();
        
        music();
        showText("Score: " + score1, 100, 350);
        contador++;
        if ((contador%100)==0){
        Asteroid asteroide = new Asteroid();
        addObject (asteroide, getWidth(), Greenfoot.getRandomNumber(getHeight()));
        }
        if (contador==primerAste){
            score1++;
            //scoreprint.setScore(score1);
            primerAste += 100;
        }
    }
    public void music(){
        Greenfoot.playSound("musicaJ.mp3");
    }
    private void prepare(){
        score1 = 0;
    }
}
