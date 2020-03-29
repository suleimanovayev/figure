package service.impl;

import service.FigureHeight;

public class Triangle extends Figure implements FigureHeight {
    private float a;
    private float b;
    private float c;

    public Triangle(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void draw() {
        System.out.println(this);
    }

    public double findArea() {
        checkCorrectVariable();
        double p = getHalfPerimeter();
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public double findHeight() {
        checkCorrectVariable();
        return (2 * findArea() / a);
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public void setB(float b) {
        this.b = b;
    }

    public void setC(float c) {
        this.c = c;
    }

    public float getB() {
        return b;
    }

    public float getC() {
        return c;
    }

    private void checkCorrectVariable() {
        if (a > (b + c) || b > (c + a) || c > (a + b)) {
            throw new IllegalArgumentException("Any side in Triangle must be"
                    + " less than the sum of the two sides");
        }
    }

    private double getHalfPerimeter() {
        return (a + b + c) / 2;
    }

    @Override
    public String toString() {
        return "Triangle{"
                + "a=" + a
                + ", b=" + b
                + ", c=" + c
                + ", color=" + color
                + ", area=" + findArea()
                + '}';
    }
}
