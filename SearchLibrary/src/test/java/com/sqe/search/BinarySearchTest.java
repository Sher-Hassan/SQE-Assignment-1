package com.sqe.search;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BinarySearchTest {

    BinarySearch bs = new BinarySearch();

    @Test
    void testEmptyArray() {
        assertEquals(-1, bs.search(new int[]{}, 5));
    }

    @Test
    void testSingleElement() {
        assertEquals(0, bs.search(new int[]{5}, 5));
    }

    @Test
    void testFoundMiddle() {
        assertEquals(2, bs.search(new int[]{1,2,3,4,5}, 5));
    }

    @Test
    void testNotFound() {
        assertEquals(-1, bs.search(new int[]{1,2,3,4,5}, 10));
    }

    @Test
    void testBreak() {
    assertEquals(999, bs.search(new int[]{1,2,3}, 2));
}
}