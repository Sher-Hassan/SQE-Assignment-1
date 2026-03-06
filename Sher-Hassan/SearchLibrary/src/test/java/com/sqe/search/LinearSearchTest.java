package com.sqe.search;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class LinearSearchTest {

    LinearSearch ls = new LinearSearch();

    @Test
    void testEmptyArray() {
        assertEquals(-1, ls.search(new int[]{}, 5));
    }

    @Test
    void testNullArray() {
        assertEquals(-1, ls.search(null, 5));
    }

    @Test
    void testSingleElement() {
        assertEquals(0, ls.search(new int[]{5}, 5));
    }

    @Test
    void testFoundAtBeginning() {
        assertEquals(0, ls.search(new int[]{1, 2, 3, 4, 5}, 1));
    }

    @Test
    void testFoundInMiddle() {
        assertEquals(2, ls.search(new int[]{1, 2, 3, 4, 5}, 3));
    }

    @Test
    void testFoundAtEnd() {
        assertEquals(4, ls.search(new int[]{1, 2, 3, 4, 3}, 5));
    }

    @Test
    void testNotFound() {
        assertEquals(-1, ls.search(new int[]{1, 2, 3, 4, 5}, 10));
    }
}