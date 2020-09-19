public class Main {
    public static void main(String[] args) {
    int percent = (int) (Math.random()*100+1);

//        System.out.println("Before resize:");
//        Circle circle = new Circle("indigo", false, 3.5);
//        System.out.println(circle);
//        System.out.println("After resize with "+percent);
//        circle.resize(percent);
//        System.out.println(circle);

//        System.out.println("Before resize:");
//        Rectangle rectangle = new Rectangle("orange", true, 2.5, 3.8);
//        System.out.println(rectangle);
//        System.out.println("After resize with "+percent);
//        rectangle.resize(percent);
//        System.out.println(rectangle);

        System.out.println("Before resize:");
        Square square = new Square("yellow", true, 5.8);
        System.out.println(square);
        System.out.println("After resize with "+percent);
        square.resize(percent);
        System.out.println(square);
        square.howToColor();
    }
}
