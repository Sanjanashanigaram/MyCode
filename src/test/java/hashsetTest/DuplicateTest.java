package hashsetTest;

import hashset.Duplicate;
import junit.framework.Assert;
import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;

public class DuplicateTest {
    Duplicate val = new Duplicate();
    @Test
    public void testDuplicate(){


        assertNotSame("ujnas",val.noDuplicate("sanju"));
        assertEquals("sai",val.noDuplicate("saiS"));

        //false case
        assertNotSame("ais",val.noDuplicate("sai"));

        //null case
        assertNotSame(" ",val.noDuplicate(" "));
        assertNotSame(" ",val.noDuplicate(null));

    }
}