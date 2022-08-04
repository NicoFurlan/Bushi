// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class SAMURAI extends Actor
{
    private int score = 0;

    /**
     * Act - do whatever the SAMURAI wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(2);
        if (Greenfoot.isKeyDown("left")) {
            turn(-5);
        }
        if (Greenfoot.isKeyDown("right")) {
            turn(5);
        }
        eatPower();
    }

    /**
     * 
     */
    public void eatPower()
    {
        if (isTouching(ball.class)) {
            removeTouching(ball.class);
            score = score + 1;
            getWorld().showText("Puntuaje:" + score, 100, 30);
        }
    }
}
