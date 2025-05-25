package shapes;

public class Rectangle {

    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int calculateArea() {
        return width * height;
    }

    public int calculatePerimeter() {
        return 2*(width+height);
    }

    public boolean isSquare() {
        boolean isSquare = false;

        if (width == height) {
            isSquare = true;
        }

        return isSquare;
    }
}
