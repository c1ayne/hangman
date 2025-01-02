// class Main класс отвечающий за вход в игру
// class Game класс отвечающий за геймплей игры
// class Field класс отвечающий за рисовку поля в консоли
// class Words класс отвечающий за выбор слова


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Boolean flag = true;
        Scanner scanner = new Scanner(System.in);

        while (flag) {
            System.out.println("\t\tМЕНЮ\n" +
                    "Выберите пункт меню:\n" +
                    "1) Начать новую игру\n" +
                    "2) Закончить игру\n" +
                    "Выбор: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    Game.start();
                    break;
                case "2":
                    flag = false;
                    break;
                default:
                    System.out.println("Введите 1 или 2 в зависимости от вашего выбора");
            }
        }
    }
}