public class Triangle extends Figure implements Square {
    private double height;
    private double side;

    public Triangle(double h, double s) {
        this.height = h;
        this.side = s;
    }

    @Override
    public String getName() {
        return "Triangle";
    }

    @Override
    public double getSquare() {
        return height * side / 2;
    }
}
