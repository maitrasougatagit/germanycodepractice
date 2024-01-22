package java8app;

public class ComplexPointAction implements  PointAction{

    public void doPerform(Point point) {
        System.out.println("Override method from interface complex  Action");
        point.varyPoints();
    }
}
