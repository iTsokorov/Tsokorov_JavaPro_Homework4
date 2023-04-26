package com.hillel.homework8.GeometricFigure;

public class Triangle implements GeometricFigure {
    private final double base;
    private final double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double areaGeometricFigure() {
        return 0.5 * base * height;

    }
}
