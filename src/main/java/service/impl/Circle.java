package service.impl;

public class Circle extends Figure {
    private float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    public void draw() {
        System.out.println(this);

    }

    public double findArea() {
        return Math.pow(radius, 2) * Math.PI;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{"
                + "radius=" + radius
                + ", color=" + color
                + ", area=" + findArea()
                + '}';
    }
}
