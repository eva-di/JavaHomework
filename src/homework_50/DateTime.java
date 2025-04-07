package homework_50;
/*
Task 2
Получить и вывести на экран:
- текущую дату
- текущий год, месяц и день

- Создать дату, например Ваш день рождения и вывести на экран
- Создать две даты и проверить на равенство

Получить и вывести на экран:
- текущее время
_ текущее время + 3 часа
Создать дату:
- которая на неделю позже сегодняшней
- которая была на год раньше сегодняшней используя метод minus
- которая на год позже сегодняшней
- tomorrow и yesterday и проверить находятся ли они до или после сегодняшней

 */


import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.stream.Collectors;

public class DateTime {

    public static void main(String[] args) {

        System.out.println("\n============ Task 1 ===================");
        LocalDate today = LocalDate.now();
        System.out.println("Сегодня: " + today);
        System.out.println("Год: " + today.getYear() + ", месяц: " + today.getMonth() + ", день: " + today.getDayOfMonth());

        System.out.println("\n_______________________________");
        LocalDate myBirthday = LocalDate.of(1988, 05, 24);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String formatedBirthday = myBirthday.format(format);
        System.out.println("Дата рождения: " + formatedBirthday);

        System.out.println("\n_______________________________");
        LocalDate date1 = LocalDate.of(2025, 02, 14);
        LocalDate date2 = LocalDate.of(2024, 02, 14);
        System.out.println("date1: " + date1 + " | date2: " + date2);
        System.out.println("date1.equals(date2): " + date1.equals(date2));

        System.out.println("\n_______________________________");
        LocalTime time = LocalTime.now();
        System.out.println("Время сейчас: " + time);
        System.out.println("Время плюс 3 часа: " + time.plusHours(3));

        System.out.println("\n_______________________________");
        LocalDate date3 = today.plusWeeks(1);
        System.out.println("Дата через неделю: " + date3);
        LocalDate date4 = today.minusYears(1);
        System.out.println("Дата на год раньше: " + date4);
        LocalDate date5 = today.plusYears(1);
        System.out.println("Дата через год: " + date5);

        LocalDate tomorrow = today.plusDays(1);
        System.out.println("Дата завтра: " + tomorrow);

        LocalDate yesterday = today.minusDays(1);
        System.out.println("Дата вчера: " + yesterday);

        boolean before = yesterday.isBefore(today);
        boolean after = tomorrow.isAfter(today);
        System.out.println("yesterday.isBefore(today): " + before);
        System.out.println("tomorrow.isAfter(today): " + after);

        System.out.println("\n============ Task 2 ===================");
        List<LocalDate> dates = new ArrayList<>();
            dates.add(LocalDate.of(2023, 12, 10));
            dates.add(LocalDate.of(2025, 3, 31));
            dates.add(LocalDate.of(2025, 1, 1));
            dates.add(null);

        long days = daysBetweenFirstAndLast(dates);
        System.out.println("Количество дней между самой ранней и поздней датами: " + days);

    }
    /*
    Task 3
    Написать метод, принимающий список из нескольких дат типа LocalDate и
    возвращающий количество дней между самой ранней и поздней датами в этом списке
     */

    public static long daysBetweenFirstAndLast(List<LocalDate> dates) {

        List<LocalDate> filteredDates = dates.stream()
                .filter(Objects::nonNull)
                .collect(Collectors.toList());

        if (filteredDates.isEmpty()) {
            throw new IllegalArgumentException("Список пуст");
        }

        LocalDate minDate = Collections.min(filteredDates);
        LocalDate maxDate = Collections.max(filteredDates);

        return ChronoUnit.DAYS.between(minDate, maxDate);
    }

}
