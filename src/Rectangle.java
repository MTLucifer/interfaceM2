public class Rectangle extends Shape {
    private double width,height;

    public Rectangle() {
        this.width =1.0;
        this.height =1.0;
    }

    public Rectangle(String color, boolean filled) {
        super(color, filled);
    }

    public Rectangle(String color, boolean filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return width*height;
    }

    public double getPerimeter() {
        return (width+height)*2;
    }

    @Override
    public String toString() {
        return "A Rectangle with width= "+width+" and length= "+height+", which is a subclass of "+super.toString();
    }

    @Override
    public void resize(double percent) {
        this.height = (height / 100)*percent;
        this.width = (width / 100)*percent;
    }

    @Override
    public void howToColor() {

    }
}
