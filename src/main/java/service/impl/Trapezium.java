package service.impl;

import service.FigureDiagonal;
import service.FigureHeight;

public class Trapezium extends Figure implements FigureDiagonal, FigureHeight {
    private float a;
    private float b;
    private float c;
    private float d;

    public Trapezium(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = c;
    }

    public void draw() {
        System.out.println(this);
    }

    public double findArea() {
        if (checkVariables()) {
            return 0;
        }
        float first = (a + b) / 2;
        float second = (float) Math.pow((a - b) / 2, 2);
        return first * Math.sqrt(Math.pow(c, 2) - second);
    }

    @Override
    public double findHeight() {
        return checkVariables() ? 0 :
                2 * findArea() / (a + b);
    }

    @Override
    public double findDiagonal() {
        return checkVariables() ? 0
                : Math.sqrt(Math.pow(c, 2) + (a * b));
    }

    private boolean checkVariables() {
        return (a == 0 || b == 0 || c == 0);
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "Trapezium{"
                + "a=" + a
                + ", b=" + b
                + ", c=" + c
                + ", color=" + color
                + ", area=" + findArea()
                + ", height=" + findHeight()
                + ", diagonal=" + findDiagonal()
                + '}';
    }
}
