import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import service.impl.Circle;
import service.impl.Color;
import service.impl.Figure;
import service.impl.Square;
import service.impl.Trapezium;
import service.impl.Triangle;

import static java.time.chrono.JapaneseEra.values;

public class Generator {
    private static final int VARIABLE_VALUE = 100;
    private static int subclasses = 4;

    public static List<Figure> randomFigure(int quantity) {
        List<Figure> array = new ArrayList<>();
        Figure figure = null;
        Random random = new Random();
        for (int i = 0; i < quantity; i++) {
            int randomNumber = random.nextInt(subclasses);

            switch (randomNumber) {
                case 0:
                    float radius = random.nextFloat() * VARIABLE_VALUE;
                    figure = new Circle(radius);
                    break;
                case 1:
                    float side = random.nextFloat() * VARIABLE_VALUE;
                    figure = new Square(side);
                    break;
                case 2:
                    float a = random.nextFloat() * VARIABLE_VALUE;
                    float b = random.nextFloat() * VARIABLE_VALUE;
                    float c = random.nextFloat() * VARIABLE_VALUE;
                    figure = new Trapezium(a, b, c);
                    break;
                case 3:
                    float d = random.nextFloat() * VARIABLE_VALUE;
                    float f = random.nextFloat() * VARIABLE_VALUE;
                    float g = random.nextFloat() * VARIABLE_VALUE;
                    figure = new Triangle(d, f, g);
                    break;
            }
            figure.setColor(randomColor());
            array.add(figure);
        }
        return array;
    }

    private static Color randomColor() {
        Random random = new Random();
        return Color.values()[random.nextInt(values().length)];
    }
}
