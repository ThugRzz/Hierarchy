public class Quadrangle extends Figure implements Square {
    private double height;
    private double width;

    public Quadrangle(double h, double w) {
        this.height = h;
        this.width = w;
    }

    @Override
    public String getName() {
        return "Quadrangle";
    }

    @Override
    public double getSquare() {
        return height * width;
    }
}
