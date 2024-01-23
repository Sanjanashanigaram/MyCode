package string;
import org.junit.Test;
import string.RotationCheck;

import static org.junit.Assert.*;

public class RotationCheckTest {

    @Test
    public void testIsRotation_PositiveCase() {
        String str1 = "JavaJ2eeStrutsHibernate";
        String str2 = "StrutsHibernateJavaJ2ee";
        assertTrue(RotationCheck.isRotation(str1, str2));
    }

    @Test
    public void testIsRotation_PositiveCase_DifferentLengths() {
        String str1 = "HelloWorld";
        String str2 = "WorldHello";
        assertTrue(RotationCheck.isRotation(str1, str2));
    }

    @Test
    public void testIsRotation_NegativeCase_EmptyString() {
        String str1 = "";
        String str2 = "RotationTest";
        assertFalse(RotationCheck.isRotation(str1, str2));
    }


    @Test
    public void testIsRotation_PositiveCase_RepeatedCharacters() {
        String str1 = "ABCDABCD";
        String str2 = "CDABCDAB";
        assertTrue(RotationCheck.isRotation(str1, str2));
    }
}
