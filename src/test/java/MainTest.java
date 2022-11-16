import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainTest {
        Calculator underTest;

        @BeforeEach
        protected void setUP() {
            underTest = new Calculator(2.3);
        }

        @Test
        public void testCalcSteps() {
            int expected = 1299;
            int result = underTest.calculateSteps();
            assertEquals(expected, result, "Must be 1300");
        }

        @Test
        void testGetIdxOfHighestY() {
            int expected = 398;
            int result = underTest.getIdOfHighestY();
            assertEquals(expected, result, "Must be 398");
        }

        @Test
        void testGetIdxOfLowestY() {
            int expected = 692;
            int result = underTest.getIdOfLowestY();
            assertEquals(expected, result, "Must be 692");
        }

        @Test
        void testCalculateArray() {
            double[][] arr = underTest.calculateArray();
            boolean result = arr.length > 0;
            assertTrue(result, "Array is empty!");
        }

        @Test
        void testCalculateArrayNotNull() {
            double[][] arr = underTest.calculateArray();
            boolean result = Arrays.stream(arr).allMatch(Objects::nonNull);
            assertTrue(result, "Array values is null!");
        }

}
