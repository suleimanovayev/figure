package service.impl;

import service.FigureDiagonal;

public class Square extends Figure implements FigureDiagonal {
    private float side;

    public Square(float side) {
        this.side = side;
    }

    public void draw() {
        System.out.println(this);
    }

    @Override
    public double findDiagonal() {
        return Math.sqrt(2 * findArea());
    }

    public double findArea() {
        return Math.pow(side, 2);
    }

    public float getSide() {
        return side;
    }

    public void setSide(float side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square{"
                + "side=" + side
                + ", color=" + color
                + ", area=" + findArea()
                + ", diagonal=" + findDiagonal()
                + '}';
    }
}
