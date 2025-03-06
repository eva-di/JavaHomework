package homework_27;

public class Main {
    public static void main(String[] args) {

//        Processor processor = new Processor("AMD", "EPYC", 4);
//        Memory memory = new Memory("Kingston", "DDR", 16);
        Storage storage = new Storage("WD", "WD-1000", 512);

        Computer myComputer = new Computer("LE-5100", storage);

        System.out.println(myComputer.toString());

        Storage storage1 = new Storage("Gnusmas", "SA-500", 512);
       // Computer computer = new Computer("")

//        myComputer.showInfo();
//
//        Storage newStorage = new Storage("Samsung", "970", 1024);
//        myComputer.replaceStorage(newStorage);
//        myComputer.showInfo();
    }
}
