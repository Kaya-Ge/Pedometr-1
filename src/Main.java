import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше имя:");
        String name = scanner.nextLine();
        System.out.printf("Привет, %s!", name);
        System.out.println("");
        System.out.printf("%s, сколько шагов вы сегодня прошли?", name);
        System.out.println("");
        int countOfSteps = scanner.nextInt();
        System.out.printf("%d — это отличный результат!", countOfSteps);
    }
}
