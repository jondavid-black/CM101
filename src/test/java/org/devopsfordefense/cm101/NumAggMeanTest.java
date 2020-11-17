package org.devopsfordefense.cm101;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

class NumAggMeanTest {
    @Test void numbersAreAggregated() {
       
        NumAgg na = new NumAggMean();

        List<Double> nums = new ArrayList<>();
        double sum = 0.0;
        for (int i=0; i<10; i++) {
            double val = i * 3.14159;
            nums.add(val);
            sum += val;
        }
        double mean = sum / 10;

        double result =  na.aggregate(nums);
        assertEquals(mean, result, "Aggregation did not return mean of input values");
    }
}