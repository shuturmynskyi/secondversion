package Poly1;

public class Main {
    void useCar (Car car){
        car.driving();
        System.out.println(car.getNumOfSeats());
    }

    public static void main(String[] args) {
        Main main = new Main();
        Car car = new Honda();
        main.useCar(car);

    }
}
