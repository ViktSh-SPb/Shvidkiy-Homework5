package org.viktsh.strategy;

/**
 * @author Viktor Shvidkiy
 */
public class FlyWithWings implements FlyStrategy{
    @Override
    public void fly() {
        System.out.println("Машу крыльями");
    }
}
