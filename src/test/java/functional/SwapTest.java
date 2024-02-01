package functional;
import functional.Swap;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class SwapTest {
    @Test
    void testSwapForTrue() {
        int[] values = {5, 10};
        Swap.swap(values);
        assertArrayEquals(new int[]{10, 5}, values);
    }

    @Test
    void testSwapForFalse() {
        int[] values = {5, 10};
        Swap.swap(values);
        assertNotEquals(new int[]{5, 10}, values);
    }

    @Test
    void testSwapForNull() {
        assertThrows(IllegalArgumentException.class, () -> Swap.swap(null));
    }
}
