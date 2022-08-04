// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class enemy extends Actor
{

    /**
     * Act - do whatever the enemy wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(2);
        if (Greenfoot.getRandomNumber(100) < 10) {
            turn(Greenfoot.getRandomNumber(15) - 30);
        }
        eatSamurai();
    }

    /**
     * 
     */
    public void eatSamurai()
    {
        if (isTouching(SAMURAI.class)) {
            removeTouching(SAMURAI.class);
            getWorld().showText("Perdiste!", 300, 200);
        }
    }
}
