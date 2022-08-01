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
    Score scoreprint = null;
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
        addObject(hitboxRocket,100,200);
        addObject(rocket,100,200);
        //Agregar la hitbox in the same place
        
        
        
        //Crear y agregar score
        scoreprint = new Score();
        scoreprint.setScore(0);
        addObject(scoreprint,150,150);
    }
    public void act(){
        //addAsteroid();
        contador++;
        //System.out.println(contador);
        if ((contador%100)==0){
        Asteroid asteroide = new Asteroid();
        addObject (asteroide, getWidth(), Greenfoot.getRandomNumber(getHeight()));
        }
        if (contador==primerAste){
            score1++;
            scoreprint.setScore(score1);
            primerAste += 100;
        }
    }
    //public void addAsteroid(){
        //if (Greenfoot.getRandomNumber(100)<1 ){
           // Asteroidd asteroide= new Asteroidd();
            //addObject(asteroide, 600, Greenfoot.getRandomNumber(401));            
        //}
        
        
    }
