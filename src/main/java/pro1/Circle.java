package pro1;

public class Circle<T extends Number>
{
    private T radius;
    public Circle(T radius) {
        this.radius = radius;
    }
    public double getArea() {
        return Math.PI
                * radius.doubleValue()
                * radius.doubleValue();
    }
}
