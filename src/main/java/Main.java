import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Race race = new Race();
        Car[] cars = new Car[3];

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
            while (true) {
                try {
                    System.out.println("Укажите максимальную скорость " + i + " автомобиля");
                    speed = Integer.parseInt(scanner.nextLine());
                    if (speed > 250 || 0 > speed) {
                        throw new Exception();
                    } else {
                        break;
                    }
                } catch (Exception ex) {
                    System.out.println("Неверная скорость");
                }
            }

            Car car = new Car(model, speed);
            cars[i-1] = car;
            race.race(cars[i-1].model, cars[i-1].speed);
        }
        System.out.println("Самый быстрый автомобиль: " + race.vinner);
    }
}