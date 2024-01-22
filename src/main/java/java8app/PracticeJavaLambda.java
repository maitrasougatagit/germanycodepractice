package java8app;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PracticeJavaLambda {


    public static void main(String arg[]){
        PointArrayList pointList = new PointArrayList();
        Point p1 = new Point();
        Point p2 = new Point();
        pointList.add(p1);
        pointList.add(p2);
        PointAction simplePointAction = new SimplePointAction();
        PointAction complexAction = new ComplexPointAction();
        pointList.forEachData(simplePointAction);
        pointList.forEachData(complexAction);



//        oldwaySimple(pointList);
//        oldwayComplex(pointList);
//        newwaySimple(pointList);
//        newwayComplex(pointList);
    }

//    public static void oldwaySimple(List<Point> points){
//        Iterator<Point> itr = points.iterator();
//        while(itr.hasNext()){
//            Point p = itr.next();;
//            p.doTranslate();
//        }
//
//    }
//    public static void oldwayComplex(List<Point> points){
//        Iterator<Point> itr = points.iterator();
//        while(itr.hasNext()){
//            Point p = itr.next();;
//            p.varyPoints();
//        }
//
//    }
//
//    public static void newwaySimple(List<Point> points){
//        PointAction simplePointAction = new SimplePointAction();
//        points.stream().forEach(simplePointAction);
//    }
//
//    public static void newwayComplex(List<Point> points){
//        PointAction complexAction = new ComplexPointAction();
//        points.stream().forEach(complexAction);
//    }


}
