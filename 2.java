public class Circle {
    private double radius;
    private double diameter;

    public Circle(double radius, double diameter) {
        this.radius = radius;
        this.diameter = diameter;
    }

    public double calculateArea() {
        return Math.PI * Math.pow(diameter / 2, 2);
    }

    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Circle circle = new Circle(5.0, 10.0);

        System.out.println("Площа кола = " + circle.calculateArea());
        System.out.println("Довжина кола = " + circle.calculateCircumference());
    }
}