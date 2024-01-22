package java8app;

import java.util.ArrayList;
import java.util.List;

public class PointArrayList extends ArrayList<Point> {

    public void forEachData(PointAction pointAction){
        for(Point p: this){
            pointAction.doPerform(p);
        }

    }


}
