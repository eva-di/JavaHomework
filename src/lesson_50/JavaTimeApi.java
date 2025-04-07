package lesson_50;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;


public class JavaTimeApi {

    // Java Time Api / java.time

    /*
    util.Date
    util.Calendar
    text.SimpleDateFormat

    Joda-Time ???
     */

    public static void main(String[] args) {

        // LocalDate - представляет дату, (год, месяц, день) без времени

        LocalDate date = LocalDate.now(); // возвращает текущую дату - иммутабельный!!! неизменный
        System.out.println("date:  " + date);

        // прибавить 1 день к дате
        LocalDate tomorrow = date.plusDays(1);
        System.out.println("tomorrow: " + tomorrow);

        System.out.println("plusWeeks: " + date.plusWeeks(4)); // плюс 4 недели к дате
        System.out.println("minusMonths: " + date.minusMonths(2)); // минус 2 месяца

        LocalDate date1 = LocalDate.of(2002, 2, 15); // установить дату (год, месяц, число)
        System.out.println("date1: " + date1);

        // Можно использовать enum с названием месяца
        date1 = LocalDate.of(2002, Month.FEBRUARY,15);
        System.out.println("date1: " + date1);

        System.out.println("Год: " + date.getYear() + "; месяц: " + date.getMonth() + "; месяц-цифра: " + date.getMonthValue());

        System.out.println("число: " + date.getDayOfMonth() + "; день недели: " + date.getDayOfWeek() + "; день года: "
                + date.getDayOfYear());

        System.out.println("сколько дней в месяце: " + date.lengthOfMonth() + "; дней в году: " + date.lengthOfYear() +
                 "; был ли год високосным: " + date.isLeapYear());

        // Преобразование строки в объект даты
        String dateString = "2000-10-25";
        LocalDate date2 = LocalDate.parse(dateString); // получение из строки даты
        System.out.println(date2.getDayOfMonth() + "/" + date2.getMonthValue() + "/" + date2.getYear());

        System.out.println("\n============LocalTime============");
        //LocalTime - представляет время (часы, минуты, секунды, наносекунды)
        LocalTime time = LocalTime.now(); // возвращает текущее время
        System.out.println("time: " + time);

        LocalTime time1 = LocalTime.of(21, 33);
        System.out.println("time1: " + time1);
        time1 = LocalTime.of(21,33,44);
        time1 = LocalTime.of(21,33,44, 54875);
        System.out.println("time1: " + time1);

        LocalTime time2 = time.plusHours(1); // добавляет 1 час к объекту времени
        System.out.println("now + 1 час: " + time2);
        System.out.println("time.plusMinutes(65): " + time.plusMinutes(65));
        System.out.println("time.minusSeconds(30): " + time.minusSeconds(30));

        System.out.println(time.getHour() + " | " + time.getMinute() + " | " + time.getSecond() + " | " + time.getNano());

        String timeString = "12:13:45"; // обязательно ':' И корректные числа
        LocalTime parseTime = LocalTime.parse(timeString);
        System.out.println(parseTime);

        System.out.println("\n========================LocalDateTIme=======================");

//        LocalDateTime - представляет дату и время Без учета часового пояса
        LocalDateTime now = LocalDateTime.now(); //текущая дата-время
        System.out.println(now);

        LocalDate localDate = LocalDate.of(2011, Month.AUGUST, 15);
        LocalTime localTime = LocalTime.of(15, 22, 59);
        LocalDateTime dateTime = LocalDateTime.of(localDate, localTime);
        System.out.println("dateTime: " + dateTime);

        dateTime = LocalDateTime.of(2025, 12, 31, 23,59);
        System.out.println(dateTime.getDayOfWeek());
        System.out.println(dateTime.getDayOfWeek().getValue());
        System.out.println("dateTime.plusHours(1): " + dateTime.plusHours(1));
        System.out.println("dateTime.minusYears(1): " + dateTime.minusYears(1));

        System.out.println("\n===============ZonedDateTime==================");
        //ZonedDateTIME - представляет дату и время в часовом поясе

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime + " | " + zonedDateTime.getZone());

        System.out.println("\n=========isAfter, isBefore, until, equals ==========");

        LocalDate date3 =LocalDate.of(2020, 10, 16);
        LocalDate date4 = LocalDate.of(2020, 6, 25);

        // isAfter, isBefore, until, equals - есть у всех объектов, представляющих дату и/или время
        // boolean isAfter - проверяет, что текущий объект после (позже) указанного объекта
        boolean isAfter = date3.isAfter(date4);
        System.out.println("date3.isAfter(date4): " + isAfter);

        // isBefore - проверяет, что текущий объект о и ли раньше указанного объекта
        System.out.println("date3.isBefore(date4): " + date3.isBefore(date4));

        // equals - проверяет дату/ время на равенство
        System.out.println("date3.equals(date4): " + date3.equals(date4));

        // long until - измеряет время между текущим и указанным объектом даты/времени

        long between = date3.until(date4, ChronoUnit.DAYS);
        System.out.println("between: " + between);

        LocalDateTime dateTime1 = LocalDateTime.now();
        LocalDateTime dateTime2 = dateTime1.minusDays(15);
        System.out.println(dateTime2.until(dateTime1, ChronoUnit.DAYS));
        System.out.println(dateTime2.until(dateTime1, ChronoUnit.SECONDS));

        LocalDateTime dateTime3 = dateTime1.plus(10, ChronoUnit.DAYS);
        System.out.println("dateTime1.plus(10, ChronoUnit.DAYS): " + dateTime3);
        dateTime3 = dateTime.minus(10, ChronoUnit.MINUTES);
        System.out.println(dateTime3);

        // метод ChronoUnit - .between() -> long

        long hourBetween = ChronoUnit.HOURS.between(dateTime3, dateTime2);
        System.out.println("hourBetween: " + hourBetween);

        System.out.println("\n============Instant, Duration, Period============");
        // Instant - представляет собой точку на временной шкале в Григорианском календаре с точностью до наносекунд
        // Unix epoch (Epoch time) - эпоха юникс. - началась с 1 января 1970 года.
        // момент времени, он основан на количестве секунд и наносекунд, прошедших с 1 января 1979 года
        Instant newInstant = Instant.now();

        long millies = newInstant.toEpochMilli(); // получаем количество миллисекунд с 1970-01-01
        System.out.println(millies);
        Instant instant = Instant.ofEpochMilli(millies); // получить из миллисекунд объект интсанта
        System.out.println(instant);

        // Duration, Period - представляют собой отрезки времени (временные интервалы), но используются для разных типов временных единиц
        // Duration - продолжительность в секундах и наносекундах
        // Period - разница (продолжительность) в днях, месяцах, годах

        // DateTimeFormatter форматирование даты и времени
        LocalDateTime nowLDT = LocalDateTime.now();
        System.out.println(nowLDT);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String fomattedString = nowLDT.format(formatter);
        System.out.println("fomattedString: " + fomattedString);

        /*
        y - год
        M _ месяц
        d - день
        H - чаc в формате от 0 до 23
        h - час в формате от 0 до 12, флаг 'a' для отображения AM/PM
        m - минута
        s - секунды

        Количество повторений символов определяет формат отображения значений
        yyyy - 4-х значный год
        yy - двухзначный год, например '23" для 2023 Года
        М - месяц в сыром формате -> "2", "12"
        ММ - месяц в двузначном формате -> "02", "12"
        d - сырой номер для -> "3", "29"
        dd - двузначный день -> "03", "29"

         */
        // Есть строка с датой - создать объект LDT соответствующий этой дате
        String dateForParse = "23-10-26 19:15";
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yy-MM-dd HH:mm");
        LocalDateTime parseDate =LocalDateTime.parse(dateForParse, formatter1);
        System.out.println("parseDate: " + parseDate);
        System.out.println(parseDate.getDayOfWeek() + " | " + parseDate.getHour());

        System.out.println("===========Task1==============");
        // "15-12-2022 20-46"
        // запарсить строку в формат LocalDateTime
        // распечатать отдельно месяц, день, час

        String dateStr1 = "15-12-2022 20-46";
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH-mm");
        LocalDateTime parseDate2 = LocalDateTime.parse(dateStr1, formatter2);
        System.out.println(parseDate2);
        System.out.println(parseDate2.getMonthValue() + " | " + parseDate2.getDayOfMonth() + " | " + parseDate2.getHour());

        String dateStr2 = "13-01-2023 00-47";
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH-mm");
        LocalDateTime parseDate3 = LocalDateTime.parse(dateStr2, formatter3);
        System.out.println(parseDate3);
        System.out.println(parseDate3.getMonthValue() + " | " + parseDate3.getDayOfMonth() + " | " + parseDate3.getHour());
















    }
}
