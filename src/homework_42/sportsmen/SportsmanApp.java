package homework_42.sportsmen;

import java.util.Arrays;
import java.util.Comparator;

public class SportsmanApp {
    public static void main(String[] args) {

        Sportsman[] sportsmen = new Sportsman[5];

        sportsmen[0] = new Sportsman("Viktor", 25, 25.5);
        sportsmen[1] = new Sportsman("David", 19, 45.6);
        sportsmen[2] = new Sportsman("John", 28, 49.0);
        sportsmen[3] = new Sportsman("Patrick", 20, 45.6);
        sportsmen[4] = new Sportsman("Alex", 26, 47.6);

        printSportsmen(sportsmen);

        Arrays.sort(sportsmen);
        printSportsmen(sportsmen);

        SportsmenScoreComparator spScCom = new SportsmenScoreComparator();

        Arrays.sort(sportsmen, spScCom);
       //можно сразу передать новый объект в качестве второго параметра: Arrays.sort(sportsmen, new SportsmenScoreComparator());
        printSportsmen(sportsmen);

        Arrays.sort(sportsmen, new Comparator<Sportsman>() {
            @Override
            public int compare(Sportsman sp1, Sportsman sp2) {
                return sp1.getAge() - sp2.getAge();
            }
        });

        printSportsmen(sportsmen);

//        Arrays.sort(sportsmen, new Comparator<Sportsman>() {
//            @Override
//            public int compare(Sportsman sp1, Sportsman sp2) {
//                return sp1.getName().compareTo(sp2.getName());
//            }
//        });
//
//        printSportsmen(sportsmen);

        // НАДО ДОПИСАТЬ с лямбдой!!! Arrays.sort(ssp1, sp2) -> Integer.compare(s1.getAge(), s2.getAge());



    }

    public static void printSportsmen(Sportsman[] sportsmen) {

        System.out.println("===============================================");
        for (Sportsman sportsman : sportsmen)
            System.out.println(sportsman);
        System.out.println("===============================================\n");
    }
}
