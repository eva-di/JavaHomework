package homework_42.sportsmen;

import java.util.Comparator;

public class SportsmenScoreComparator implements Comparator<Sportsman> {

    @Override
    public int compare(Sportsman sp1, Sportsman sp2) {
        // Такая реализация будет работать неправильно при разнице очков меньше единицы
        // return (int) sp1.getScore() - sp2.setScore();
        return Double.compare(sp1.getScore(), sp2.getScore());
    }
}
