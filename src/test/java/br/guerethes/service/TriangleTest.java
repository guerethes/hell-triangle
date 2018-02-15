package br.guerethes.service;

import br.guerethes.exception.TriangleException;
import junit.framework.TestCase;
import org.junit.Test;

public class TriangleTest {

    @Test
    public final void test1() throws TriangleException {
        int[][] input = { { 6 }, { 3, 5 }, { 9, 7, 1 }, { 4, 6, 8, 4 } };
        Triangle triangle = new Triangle(input);
        TestCase.assertEquals(26, triangle.sumTriangle());
    }

    @Test
    public final void test2() throws TriangleException {
        int[][] input = { { 1 }, { 3, 1 }, { 7, 3, 7 }, { 2, 7, 5, 2 } };
        Triangle triangle = new Triangle(input);
        TestCase.assertEquals(18, triangle.sumTriangle());
    }

    @Test(expected = TriangleException.class)
    public final void test3() throws TriangleException {
        int[][] input = null;
        Triangle triangle = new Triangle(input);
        TestCase.assertEquals(10, triangle.sumTriangle());
    }

    @Test
    public final void test4() throws TriangleException {
        int[][] input = { { 9 }, { 7, 1 }, { 8, 7, 5 } };
        Triangle triangle = new Triangle(input);
        TestCase.assertEquals(24, triangle.sumTriangle());

    }

    @Test
    public final void test5() throws TriangleException {
        int[][] input = { { 3 }, { 3, 6 }, { 4, 7, 9 }, { 9, 6, 4, 7 },
                { 5, 8, 1, 9, 7 }, { 7, 8, 6, 2, 2, 4 },
                { 4, 4, 1, 3, 2, 1, 8 } };
        Triangle triangle = new Triangle(input);
        TestCase.assertEquals(44, triangle.sumTriangle());
    }

    @Test
    public final void test6() throws TriangleException {
        int[][] input = { { 7 }, { 7, 4 }, { 1, 2, 3 }, { 8, 9, 1, 3 } };
        Triangle triangle = new Triangle(input);
        TestCase.assertEquals(25, triangle.sumTriangle());
    }

}