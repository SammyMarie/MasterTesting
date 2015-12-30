package uk.co.sammy.classes;

<<<<<<< HEAD

=======
>>>>>>> b2cb363d7067e6e92d8ab6222f218929c78852f9
import org.junit.experimental.theories.ParameterSignature;
import org.junit.experimental.theories.ParameterSupplier;
import org.junit.experimental.theories.PotentialAssignment;

import java.util.ArrayList;
import java.util.List;

<<<<<<< HEAD

=======
/**
 * Created by smlif on 21/12/2015.
 */
>>>>>>> b2cb363d7067e6e92d8ab6222f218929c78852f9
public class StringSupplier extends ParameterSupplier {

    @Override
    public List<PotentialAssignment> getValueSources(ParameterSignature sig) {
        List<PotentialAssignment> list = new ArrayList<>();
        list.add(PotentialAssignment.forValue("first", "Sammy"));
        list.add(PotentialAssignment.forValue("second", "Marie"));
        return list;
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> b2cb363d7067e6e92d8ab6222f218929c78852f9
