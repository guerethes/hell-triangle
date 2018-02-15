package br.guerethes.service;

import br.guerethes.exception.TriangleException;

import java.util.Vector;

public class Triangle {

    private int[][] triangle;
    private static Vector<Integer> soluction;
    private static int sum = 0;

    public Triangle(int[][] triangle) {
        this.triangle = triangle;
        this.sum = 0;
    }

    public int sumTriangle() throws TriangleException {
        if ( triangle == null || triangle.length == 0 ) {
            throw new TriangleException("Empty Triangle!");
        }

        if ( !valid(triangle) ) {
            throw new TriangleException("Invalid Triangle!");
        }

        runAlgorithm(triangle, new Vector<Integer>(), 0, 0);
        return sum;
    }

    private static void runAlgorithm(int[][] triangle, Vector<Integer> elements, int line, int colunn) {
        if (line < triangle.length) {
            //Left Element
            int element = triangle[line][colunn];
            elements.add(element);
            runAlgorithm(triangle, elements, line + 1, colunn);

            //Right Element
            if ( line > 0 ) {
                element = triangle[line][colunn + 1];
                elements = new Vector(elements.subList(0, line));
                elements.add(element);
                runAlgorithm(triangle, elements, line + 1, colunn + 1);
            }
        } else {
            int sumTemp = 0;
            for (Integer num : elements) { sumTemp += num; }
            if ( sumTemp > sum ) {
                sum = sumTemp;
                soluction = elements;
            }
        }
    }

    private static boolean valid(int[][] triangle) {
        boolean valid = true;
        for(int row = 0; row < triangle.length; row++) {
            if(triangle[row].length != row + 1)
                valid = false;
        }
        return valid;
    }

}
