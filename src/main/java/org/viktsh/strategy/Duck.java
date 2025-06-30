package org.viktsh.strategy;

/**
 * @author Viktor Shvidkiy
 */
public class Duck {
    public FlyStrategy flyStrategy;

    public Duck(FlyStrategy flyStrategy) {
        this.flyStrategy = flyStrategy;
    }

    public void setFlyStrategy(FlyStrategy flyStrategy) {
        this.flyStrategy = flyStrategy;
    }
    public void performFly(){
        flyStrategy.fly();
    }
}
