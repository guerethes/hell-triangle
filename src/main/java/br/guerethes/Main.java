package br.guerethes;

import br.guerethes.exception.TriangleException;
import br.guerethes.service.Triangle;

public class Main {

    public static void main(String[] args) throws TriangleException {
        int[][] input = { { 1 }, { 3, 1 }, { 7, 3, 7 }, { 2, 7, 5, 2 } };
        Triangle triangle = new Triangle(input);

        System.out.println( triangle.sumTriangle() );
    }

}