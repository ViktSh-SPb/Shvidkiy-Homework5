package org.viktsh.adapter;

/**
 * @author Viktor Shvidkiy
 */
public class ImperialToMetricAdapter implements MetricDistance {
    private final ImperialDistance imperialDistance;

    public ImperialToMetricAdapter(ImperialDistance imperialDistance) {
        this.imperialDistance = imperialDistance;
    }

    @Override
    public double getDistanceInMeters() {
        return imperialDistance.getDistanceInFeet() * 0.3048;
    }
}
