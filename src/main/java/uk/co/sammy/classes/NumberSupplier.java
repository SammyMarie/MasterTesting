package uk.co.sammy.classes;

import org.junit.experimental.theories.ParameterSignature;
import org.junit.experimental.theories.ParameterSupplier;
import org.junit.experimental.theories.PotentialAssignment;

<<<<<<< HEAD
import java.util.*;

=======
import java.util.ArrayList;
import java.util.List;

/**
 * Created by smlif on 21/12/2015.
 */
>>>>>>> b2cb363d7067e6e92d8ab6222f218929c78852f9
public class NumberSupplier extends ParameterSupplier {

    @Override
    public List<PotentialAssignment> getValueSources(ParameterSignature sig) {
        List<PotentialAssignment> list = new ArrayList<>();
        list.add(PotentialAssignment.forValue("long", 2L));
        list.add(PotentialAssignment.forValue("float", 5.00f));
        list.add(PotentialAssignment.forValue("double", 89d));
        return list;
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> b2cb363d7067e6e92d8ab6222f218929c78852f9
