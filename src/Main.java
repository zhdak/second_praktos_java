import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи свои данные: свой вес в килограммах");
        System.out.println("Введи свои данные: рост в метрах через запятую(x,xx)");
        System.out.println("Введи свои данные: возраст");
        double ves = scanner.nextFloat();
        double rost = scanner.nextFloat();
        double age = scanner.nextFloat();
        double formula = ves / (rost * rost);
        double idealves = 24.9 * (rost * rost);
        double telo = 655 + (9.6 * ves) + (1.8 * 100 * rost) - (4.7 * age);
        if (formula > 24.9)
        {
            System.out.printf("Рекомендуется снизить вес для достижения идеального веса. Идеальный вес: %f. \nНеобходимо сбросить: %f кг. \nРекомендуемый дневной прием калорий: %f.", idealves, ves - idealves, telo - 500);
        }
        else if (formula < 18.5)
        {
            System.out.printf("Рекомендуется увеличить потребление пищи для набора веса. Идеальный вес: %f. \nНеобходимо набрать: %f кг. \nРекомендуемый дневной прием калорий: %f.", idealves, idealves - ves, telo + 500);
        }
        else
        {
            System.out.printf("Ваш вес находится в пределах нормы. Идеальный вес: %f. \nРекомендуемый дневной прием калорий: %f.", idealves, telo);
        }
    }
}