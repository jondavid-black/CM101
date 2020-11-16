package org.devopsfordefense.cm101;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

class NumGenTest {
    @Test void numbersAreGenerated() {
        NumGen ng = new NumGen();
        List<Double> nums = ng.generate();
        assertNotNull(nums, "NumGen should not return null");
        assertTrue(nums.size() > 0, "NumGen should return contents in the number list");
    }
}