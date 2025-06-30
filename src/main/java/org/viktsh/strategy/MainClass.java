package org.viktsh.strategy;

/**
 * @author Viktor Shvidkiy
 */
public class MainClass {
    public static void main(String[] args) {
        Duck duck = new Duck(new FlyWithWings());
        duck.performFly();
        duck.setFlyStrategy(new FlyNoWay());
        duck.performFly();
    }
}
