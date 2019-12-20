public class Circle extends Figure implements Square {

    private double radius;

    public Circle(double r) {
        this.radius = r;
    }

    @Override
    public String getName() {
        return "Circle";
    }

    @Override
    public double getSquare() {
        return Math.pow(radius, 2) * Math.PI;
    }
}
