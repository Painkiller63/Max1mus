package lesson10;

import java.util.Scanner;

public class KelvinToCelcius implements Converter{
    @Override
    public float convert() {
        float t;
        Scanner scanner = new Scanner(System.in);
            System.out.println("Введите температуру в Кельвинах:");
            while (!scanner.hasNextFloat()) {
                System.out.println("Вы ввели не число. Пожалуйста введите число: ");
                scanner.next();
            }
            t = scanner.nextFloat();
        return (float) (t - 273.15);
    }
}
