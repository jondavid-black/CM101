package org.devopsfordefense.cm101;

import java.util.LinkedList;
import java.util.List;

import org.apache.commons.math3.distribution.NormalDistribution;

public class NumGen {

    private NormalDistribution norm = null;

    public NumGen() {
        norm = new NormalDistribution(50.0, 0.5);
    }

    public List<Double> generate() {

        List<Double> retVal = new LinkedList<Double>();

        for (int i = 0; i<1000; i++) {
            retVal.add(norm.sample());
        }

        return retVal;
    } 
    
}
