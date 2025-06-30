package org.viktsh.strategy;

/**
 * @author Viktor Shvidkiy
 */
public class FlyNoWay implements FlyStrategy{
    @Override
    public void fly() {
        System.out.println("Я не умею летать");
    }
}
