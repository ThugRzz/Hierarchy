import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args){
        Quadrangle picture = new Quadrangle(50,70);
        Triangle smallTriangle=new Triangle(5.0,4.0);
        Circle smallCircle = new Circle(2.0);
        Quadrangle smallQuadrangle = new Quadrangle(2.0,3.0);
        Circle bigCircle = new Circle(8);
        Triangle bigTriangle = new Triangle(9,6);
        Quadrangle bigQuadrangle = new Quadrangle(7,10);
        Map<Double,String> figures = new HashMap<>();
        figures.put(smallCircle.getSquare(),smallCircle.getName());
        figures.put(smallTriangle.getSquare(),smallTriangle.getName());
        figures.put(smallQuadrangle.getSquare(),smallQuadrangle.getName());
        figures.put(bigCircle.getSquare(),bigCircle.getName());
        figures.put(bigTriangle.getSquare(),bigTriangle.getName());
        figures.put(bigQuadrangle.getSquare(),bigQuadrangle.getName());
        Set<Map.Entry<Double, String>> set = figures.entrySet();
        for(Map.Entry<Double,String> me:set){
            System.out.print("Square of "+me.getValue()+" = " );
            System.out.println(me.getKey());
        }
        System.out.println("Square of picture = "+picture.getSquare());
        System.out.println("``````````````````````````````````````````````````");
        for(Map.Entry<Double,String> me:set){
            System.out.print("The area of the "+me.getValue()+" from the picture is " );
            System.out.println(me.getKey()/picture.getSquare());
        }
    }
}
