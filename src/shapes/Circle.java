package shapes;

public class Circle {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double calculateCircumference() {
        return Math.PI * radius * 2;
    }

    public boolean isBiggerThan(Circle circle) {
        boolean isBigger = false;

        if (this.calculateArea() > circle.calculateArea()) {
            isBigger = true;
        }

        return isBigger;
    }
}
