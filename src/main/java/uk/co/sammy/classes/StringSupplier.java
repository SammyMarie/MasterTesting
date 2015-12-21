package uk.co.sammy.classes;

import org.junit.experimental.theories.ParameterSignature;
import org.junit.experimental.theories.ParameterSupplier;
import org.junit.experimental.theories.PotentialAssignment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by smlif on 21/12/2015.
 */
public class StringSupplier extends ParameterSupplier {

    @Override
    public List<PotentialAssignment> getValueSources(ParameterSignature sig) {
        List<PotentialAssignment> list = new ArrayList<>();
        list.add(PotentialAssignment.forValue("first", "Sammy"));
        list.add(PotentialAssignment.forValue("second", "Marie"));
        return list;
    }
}
