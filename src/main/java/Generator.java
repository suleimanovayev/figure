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

    public static List<Figure> randomFigure(int quantity) {
        List<Figure> array = new ArrayList<>();
        Figure figure = null;
        Random random = new Random();
        for (int i = 0; i < quantity; i++) {
            int randomNumber = random.nextInt(4);

            switch (randomNumber) {
                case 0:
                    float radius = random.nextFloat() * 100;
                    figure = new Circle(radius);
                    break;
                case 1:
                    float side = random.nextFloat() * 100;
                    figure = new Square(side);
                    break;
                case 2:
                    float a = random.nextFloat() * 100;
                    float b = random.nextFloat() * 100;
                    float c = random.nextFloat() * 100;
                    figure = new Trapezium(a, b, c);
                    break;
                case 3:
                    float d = random.nextFloat() * 100;
                    float f = random.nextFloat() * 100;
                    float g = random.nextFloat() * 100;
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
