package org.viktsh.adapter;

/**
 * @author Viktor Shvidkiy
 */
public class MainClass {
    public static void main(String[] args) {
        ImperialDistance distanceInFeet = new ImperialDistance(10); // 10 футов
        MetricDistance distanceInMeters = new ImperialToMetricAdapter(distanceInFeet);
        System.out.printf("Расстояние в метрах: %2fм%n", distanceInMeters.getDistanceInMeters());
    }
}
