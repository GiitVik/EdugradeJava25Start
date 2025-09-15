//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 5);

        System.out.println(rectangle.calculateArea());

        Circle circle = new Circle();
        circle.radius = 5;

        System.out.println(circle.CalculateCircumference());
    }
}