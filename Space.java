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
        
        addObject(rocket,100,200);
    }
    public void act(){
        //addAsteroid();
        contador++;
        if (contador == 100){
        Asteroid asteroide = new Asteroid();
        addObject (asteroide, getWidth(), Greenfoot.getRandomNumber(getHeight()));
        contador = 0;
        }
    }
    //public void addAsteroid(){
        //if (Greenfoot.getRandomNumber(100)<1 ){
           // Asteroidd asteroide= new Asteroidd();
            //addObject(asteroide, 600, Greenfoot.getRandomNumber(401));            
        //}
        
        
    }
