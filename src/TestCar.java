public class TestCar {
    public static void main(String[] args) {
        Car c1 = new Car(2015, "Ford", "Mustang");
        Car c2 = new Car(2015, "Ford","Mustang");
        if(c1.equalTo(c2)) {
            System.out.println("Equal");
        }
        else
        {
            System.out.println("Not equal");
        }
        System.out.println(c1.getMake());
        c1.setMake("Chevrolet");
        System.out.println(c1.getMake());
        c1.setPoint(5, 6);
        System.out.println(c1.getY());
        System.out.println(c1.getX());
        System.out.println(c1.toString());
        System.out.println("Car count: " + Car.carCount);
    }

}
