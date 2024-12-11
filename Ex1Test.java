
import assignments.ex1.Ex1;
import org.junit.jupiter.api.Test;

import static assignments.ex1.Ex1.isNumber;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * This JUnit class represents a very partial test class for Ex1.
 * Make sure you complete all the needed JUnits
 */
public class Ex1Test {
    @Test
    void computeNumberTest() {
        String s2 = "1011b2";
        int v = Ex1.number2Int(s2);
        assertEquals(v, 11);
        String s10 = "1011bA";
        v = Ex1.number2Int(s10);
        s2 = Ex1.int2Number(v, 2);
        int v2 = Ex1.number2Int(s2);
        assertEquals(v, v2);
        assertTrue(Ex1.equals(s10, s2));
    }

    @Test
    void isBasisNumberTest() {
        String[] good = {"1", "1b2", "01b2", "123bA", "ABbG", "0bA"};
        for (int i = 0; i < good.length; i = i + 1) {
            boolean ok = isNumber(good[i]);
            assertTrue(ok);
        }
        String[] not_good = {"b2", "2b2", "1G3bG", " BbG", "0bbA", "abB", "!@b2", "A", "1bb2"};
        for (int i = 0; i < not_good.length; i = i + 1) {
            boolean not_ok = isNumber(not_good[i]);
            assertFalse(not_ok);
        }
    }

    @Test
    void int2NumberTest() {
        String s1 = "11";
        int v1 = Ex1.number2Int(s1);
        assertEquals(v1, 11);
        String s2 = "133b5";
        int v2 = Ex1.number2Int(s2);
        assertEquals(v2, 43);
        String s3 = "133bA";
        int v3 = Ex1.number2Int(s3);
        assertEquals(v3, 133);
        String s4 = "888b9";
        int v4 = Ex1.number2Int(s4);
        assertEquals(v4, 728);
    }

    @Test
    void maxIndexTest() {
        String[] arr = {"32bG", "1000", "0", "357b8"};
        int k = Ex1.maxIndex(arr);
        assertEquals(k, 1);
        String[] arr1 = {"32bG", "0", "357b8", "1000"};
        int k1 = Ex1.maxIndex(arr1);
        assertEquals(k1, 3);
    }

    @Test
    void TestIsNumber() {
        boolean t = isNumber("123");
        assertTrue(t);
        boolean b = isNumber("b");
        assertFalse(b);
        boolean k = isNumber("");
        assertFalse(k);
        boolean a = isNumber("-A");
        assertFalse(a);
        boolean l = isNumber(" ");
        assertFalse(l);
        boolean h = isNumber(null);
        assertFalse(h);
        boolean i = isNumber("Ab9");
        assertFalse(i);
        boolean g = isNumber("AbS");
        assertFalse(g);
    }
}
