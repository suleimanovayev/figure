import java.util.List;
import service.impl.Figure;

public class Main {

    public static void main(String[] args) {
        List<Figure> figures = Generator.randomFigure(10);
        figures.stream().forEach(o -> o.draw());
    }
}
