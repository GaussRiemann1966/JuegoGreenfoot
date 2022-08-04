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
    GreenfootSound music = new GreenfootSound("mistery.wav");
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
    }
    public void act(){
        //Agregamos la musica
        music.playLoop();
        //Mostrar contador
        showText("Score: " + score1, 100, 350);
        contador++;
        //Agregar obstáculos
        if ((contador%100)==0){
        Asteroid asteroide = new Asteroid();
        addObject (asteroide, getWidth(), Greenfoot.getRandomNumber(getHeight()));
        }
        //Contador de puntos
        if (contador==primerAste){
            score1++;
            primerAste += 100;
        }
    }
}
