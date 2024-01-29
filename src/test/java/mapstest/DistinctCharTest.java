package mapstest;

import junit.framework.Assert;
import junit.framework.TestCase;
import maps.DistinctChar;
import java.util.HashMap;
import java.util.Map;

public class DistinctCharTest extends TestCase {
    public void testDistinct() {
        DistinctChar val = new DistinctChar();
        //true case

        HashMap<Character, Integer> charcount = val.differentOccur("Ssai");
        assertEquals(2, charcount.get('s').intValue());
        assertEquals(1, charcount.get('a').intValue());
        assertEquals(1, charcount.get('i').intValue());

        //true case with space
        HashMap<Character, Integer> charcount2 = val.differentOccur("S sai");
        assertEquals(2, charcount2.get('s').intValue());
        assertEquals(1, charcount2.get('a').intValue());
        assertEquals(1, charcount2.get('i').intValue());
        assertNotSame(1, charcount2.get(' '));

        //false case
        HashMap<Character, Integer> charcount3 = val.differentOccur("Ssai");
        assertNotSame(1, charcount3.get('s').intValue());
        assertEquals(1, charcount3.get('a').intValue());
        assertEquals(1, charcount3.get('i').intValue());

        //Null case
        HashMap<Character, Integer> charnull = val.differentOccur("");
        assertNotSame(1, charnull.get(' '));
    }
}
