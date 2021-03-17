import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RupeeTest {

    @Test
    void TestifTwoObjectWithSameValuesAreSame() {
        assertTrue(new Rupee(10).equals(new Rupee(10)));
    }
    @Test
    void TestifTwoObjectWithSameValuesAreNotSame() {
        assertFalse(new Rupee(10).equals(new Rupee(20)));
    }
}
