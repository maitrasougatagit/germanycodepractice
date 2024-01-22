package java8app;

public class SimplePointAction implements PointAction {

    public void doPerform(Point point) {
        System.out.println("Override method from interface complex  Action");
        point.varyPoints();
    }
}
