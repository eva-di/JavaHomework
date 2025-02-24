package homework_11;

public class Task_03_3 {
    public static void main(String[] args) {
        //Найдите в Интернете данные по температуре в вашем городе за прошедшую неделю (или придумайте :) )
        //Вычислите среднюю температуру за неделю и выведете ее на печать.

        int tempMon = 3;
        int tempTue = 2;
        int tempWed = 4;
        int tempThu = 1;
        int tempFri = -1;
        int tempSat = 2;
        int tempSun = 5;

        int averageTemp = (tempMon + tempTue + tempWed + tempThu + tempFri + tempSat + tempSun) /7;

        System.out.println("Средняя температура за прошлую неделю в городе N: " + "+"+ averageTemp);
    }
}
