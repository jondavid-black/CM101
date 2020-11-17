package org.devopsfordefense.cm101;

import java.util.List;

public class NumAggSum implements NumAgg {

    public NumAggSum() {}

    public double aggregate(List<Double> nums) {
        double retVal = 0;

        for (double val : nums) {
            retVal += val;
        }

        return retVal;
    }
    
}
