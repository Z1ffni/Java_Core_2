public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle() {
        this.length = 5.0; 
        this.width = 3.0;  
    }

    public double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle(8.0, 6.0);

    
        Rectangle rectangle2 = new Rectangle();

    
        System.out.println("Площа прямокутника 1 = " + rectangle1.calculateArea());
        System.out.println("Периметр прямокутника 1 = " + rectangle1.calculatePerimeter());

        System.out.println("Площа прямокутника 2 = " + rectangle2.calculateArea());
        System.out.println("Периметр прямокутника 2 = " + rectangle2.calculatePerimeter());
    }
}