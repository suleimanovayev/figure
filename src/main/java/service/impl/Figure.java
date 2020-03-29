package service.impl;

public abstract class Figure {
    protected Color color;

    public abstract void draw();

    public abstract double findArea();

    public Color getColor() {
        return color;
    }


    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "service.impl.Figure{"
                + "color=" + color.toString()
                + '}';
    }
}
