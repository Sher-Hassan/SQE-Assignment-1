package com.sqe.search;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class JumpSearchTest {

    JumpSearch js = new JumpSearch();

    @Test
    void testEmptyArray() {
        assertEquals(-1, js.search(new int[]{}, 5));
    }

    @Test
    void testNullArray() {
        assertEquals(-1, js.search(null, 5));
    }

    @Test
    void testSingleElement() {
        assertEquals(0, js.search(new int[]{5}, 5));
    }

    @Test
    void testFoundAtBeginning() {
        assertEquals(0, js.search(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 1));
    }

    @Test
    void testFoundInMiddle() {
        assertEquals(4, js.search(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 5));
    }

    @Test
    void testFoundAtEnd() {
        assertEquals(8, js.search(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 9));
    }

    @Test
    void testNotFound() {
        assertEquals(-1, js.search(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 10));
    }
}