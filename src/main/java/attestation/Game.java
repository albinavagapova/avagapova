package attestation;

import java.util.Random;
import java.util.Scanner;

public class Game {
    private int user;
    private int programm;
    private String[] valuesProgramm = {"К", "Н", "Б"};

    public Game() {
        this.user = 0;
        this.programm = 0;
    }

    public void runGame(int round) {
        //Ввод для пользователя
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение (К, Н или Б): ");
        String gameResult = scanner.next();
        //Вывод для программы рандомно
        Random random = new Random();
        int randomIndex = random.nextInt(valuesProgramm.length);
        String randomValue = valuesProgramm[randomIndex];
        System.out.println("Программа выбрала: " + randomValue);


        if (gameResult.equals(randomValue)) {
        } else if (gameResult.equals("К") && randomValue.equals("Н") || gameResult.equals("Н")
                && randomValue.equals("Б") || gameResult.equals("Б") && randomValue.equals("К")) {
            user += getScore(gameResult);
        } else {
            programm += getScore(randomValue);

        }
    }

    private int getScore(String choice) {
        switch (choice) {
            case "К":
                return 1;
            case "Н":
                return 2;
            case "Б":
                return 5;
            default:
                return 0;
        }
    }

    public void printFinalScore() {
        System.out.println("Итоговый счет - Вы: " + user + ", Программа: " + programm);
        if (user > programm) {
            System.out.println("Вы выиграли");
        } else if (user < programm) {
            System.out.println("Выиграла программа");
        } else {
            System.out.println("Ничья");
        }
    }

}





