package attestation;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Cactus {
    public static void main(String[] args) {
        LocalDate lastWatering = LocalDate.of(2024, 12, 3); // Дата последнего полива
        LocalDate currentDate = LocalDate.now(); //прошлый полив
        LocalDate nextWatering = lastWatering;//следующий полив
        Indicator indicator = new Indicator(); //рандомное число влажности

        int currentMonth = currentDate.getMonthValue();
        int humidity = indicator.humidity(); // Показать влажность
        System.out.println("Текущая влажность: " + humidity + "%");

        //Условие
        if (currentMonth == 12 || currentMonth == 1 || currentMonth == 2) { // Зима
            nextWatering = lastWatering.plus(1, ChronoUnit.MONTHS); //добавить месяц
        } else if (currentMonth >= 3 && currentMonth <= 5 || currentMonth >= 9 && currentMonth <= 11) { // Весна и осень
            nextWatering = lastWatering.plus(1, ChronoUnit.WEEKS);
        } else if (currentMonth >= 6 && currentMonth <= 8) { // Лето
            if (humidity < 30) {
                nextWatering = lastWatering.plus(2, ChronoUnit.DAYS);
            } else {
                System.out.println("Высокая влажность");
                return;
            }
        }

        System.out.println("Следующий полив кактуса будет: " + nextWatering);
    }
}

