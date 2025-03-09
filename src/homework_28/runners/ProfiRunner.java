package homework_28.runners;

import homework_28.sport.Person;

public class ProfiRunner extends Humain {


    {
        typeRunner = "Спортсмен профи";
    }

    public ProfiRunner() {
        super(25, 5);
    }

    public ProfiRunner(int speed, int timeToRest) {
        super(speed, timeToRest);
    }


}
