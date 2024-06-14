package abstraction;

public class AbstractionDemo {
    public static void main(String[] args) {
        // tinh truu tuong

        // truu tuong khong hoan toan ( < 100% )
        Circle circle = new Circle(1.0);
        System.out.println("circle.area() = " + circle.area());
        // khong the khoi tao
         // Shape shape = new Shape();

        // Interface
        // truu tuong hoan toan ( 100% )
        // mac dinh : public abstract
        //da ke thua
        circle.draw();
        circle.extend();
    }
}
