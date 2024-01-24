package relationship;

public class Audi implements Car{

    @Override
    public void make() {
        System.out.println("2024 Audi");
    }

    @Override
    public void model() {
        System.out.println("Audi R8");
    }

    @Override
    public void price() {
        System.out.println(500);
    }

    @Override
    public void color() {
        System.out.println("Black");
    }

    @Override
    public void numberOfTyres() {
        System.out.println(4);
    }

    public static void main(String[] args) {
        Car car = new Audi();
        car.model();
        car.make();
        car.color();
        car.price();
        car.numberOfTyres();
    }
}
