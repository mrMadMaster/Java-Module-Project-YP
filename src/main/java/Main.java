import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Race race = new Race();

        for (int i = 1; i <= 3; i++) {

            String model;
            while (true) {
                System.out.println("Выберите марку " + i + " автомобиля");
                model = scanner.nextLine();
                if (model.trim().isEmpty()) {
                    System.out.println("Неверная марка автомобиля");
                } else {
                    break;
                }
            }

            int speed;
            final int maxSpeed = 250;
            final int minSpeed = 0;
            while (true) {
                try {
                    System.out.println("Укажите максимальную скорость " + i + " автомобиля");
                    speed = Integer.parseInt(scanner.nextLine());
                    if (speed > maxSpeed || minSpeed > speed) {
                        throw new Exception();
                    } else {
                        break;
                    }
                } catch (Exception ex) {
                    System.out.println("Неверная скорость");
                }
            }

            Car car = new Car(model, speed);
            race.race(car.model, car.speed);
        }
        System.out.println("Самый быстрый автомобиль: " + race.vinner);
    }
}