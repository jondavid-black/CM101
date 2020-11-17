package org.devopsfordefense.cm101;

import java.util.List;

public class NumAggMean implements NumAgg {

    @Override
    public double aggregate(List<Double> nums) {
        
        double sum = 0.0;

        for (double val : nums) {
            sum += val;
        }

        return sum/nums.size();
    }
    
}
