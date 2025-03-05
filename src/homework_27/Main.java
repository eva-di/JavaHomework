package homework_27;

public class Main {
    public static void main(String[] args) {

        Processor processor = new Processor("AMD", "EPYC", 4);
        Memory memory = new Memory("Kingston", "DDR", 16);
        Storage storage = new Storage("Kingstone", "NV2", 512);

        Computer myComputer = new Computer(processor, memory, storage);

        myComputer.showInfo();

        Storage newStorage = new Storage("Samsung", "970", 1024);
        myComputer.replaceStorage(newStorage);
        myComputer.showInfo();
    }
}
