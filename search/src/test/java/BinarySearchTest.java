import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTest {

    int[] test1 = null;
    int[] test2 = new int[]{};
    int[] test3 = new int[]{0, 1, 2, 3, 4};
    int[] test4 = new int[]{0, 1, 1, 1, 2, 3, 4};
    BinarySearch binarySearch = new BinarySearch();

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void find() {
        assertTrue(binarySearch.find(test1, 0) == -1);
        assertTrue(binarySearch.find(test2, 0) == -1);
        assertTrue(binarySearch.find(test3, 0) == 0);
    }

    @Test
    public void lowerBound() {
        assertTrue(binarySearch.lowerBound(test1, 0) == -1);
        assertTrue(binarySearch.lowerBound(test2, 0) == -1);
        assertTrue(binarySearch.lowerBound(test3, 0) == 0);
        assertTrue(binarySearch.lowerBound(test4, 1) == 1);
    }

    @Test
    public void upperBound() {
        assertTrue(binarySearch.upperBound(test1, 0) == -1);
        assertTrue(binarySearch.upperBound(test2, 0) == -1);
        assertTrue(binarySearch.upperBound(test3, 0) == 0);
        assertTrue(binarySearch.upperBound(test4, 1) == 3);
    }
}