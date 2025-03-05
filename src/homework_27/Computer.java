package homework_27;

public class Computer {

    private final Processor processor;
    private final Memory memory;
    private Storage storage;

    public Computer(Processor processor, Memory memory, Storage storage) {
        this.processor = processor;
        this.memory = memory;
        this.storage = storage;
    }


    public void replaceStorage(Storage newStorage) {
        this.storage = newStorage;
        System.out.println("Установлен новый накопитель: " + newStorage.toString());
        System.out.println();

    }

    public void showInfo() {
        System.out.println("Компьютер: ");
        System.out.println(processor.toString());
        System.out.println(memory.toString());
        System.out.println(storage.toString());
        System.out.println();
    }

}
