package pro1;

public class Main10 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Circle<Double> k = new Circle<>(50d);
        Circle<Integer> k2 = new Circle<>(50);
        Circle<Byte> k3 = new Circle<>((byte)50);
        System.out.println("1. "+k.getArea() + "\n2. " + k2.getArea() + "\n3. " + k3.getArea());

        //        var k = new Circle(56.5);
//        //chci znovu změnit radius
//        System.out.println(k.getArea());
//        var class1 = Circle.class;
//        var field = class1.getDeclaredField("radius");
//        field.setAccessible(true);
//        field.set(k,56.8);
//        System.out.println(k.getArea());
    }
}
