import java.util.List;
import service.impl.Figure;

public class Main {

    public static void main(String[] args) {
        List<Figure> figures = Generator.randomFigure(10);
        figures.stream().forEach(o -> o.draw());
//        float a = 74.99752f;
//        float b=13.405573f;
//        float c=76.013855f;
//        float d=c;
//
//        float f =  (a + b) / 2;
//        float s = c*c;
//        float t = (float) Math.pow((a-b)/ 2,2);
//
//        System.out.println(f*Math.sqrt(s - t));
    }
}
