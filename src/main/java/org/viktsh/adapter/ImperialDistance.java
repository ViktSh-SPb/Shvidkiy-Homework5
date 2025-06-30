package org.viktsh.adapter;

/**
 * @author Viktor Shvidkiy
 */
public class ImperialDistance {
    private final double feet;

    public ImperialDistance(double feet) {
        this.feet = feet;
    }

    public double getDistanceInFeet(){
        return feet;
    }
}
