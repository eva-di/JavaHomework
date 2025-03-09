package homework_28.runners;

public class Amateur extends Humain {

    // Блок инициализации
    {
        typeRunner = "Любитель";
    }

    public Amateur() {
        super(15, 10);

    }

    public Amateur(int speed, int timeToRest) {
        super(speed, timeToRest);

    }


}
