
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class MainTest {

    @Test
    void testHypothenuse() {
        double result = Main.hypothenuse(10, 20);

        Assertions.assertEquals(
            22.360679774997898,
            result,
            0.000000001
        );
    }
}

