package homework_27;

public class Computer {

    private final String model;
    private  Processor processor; // Композиция - жесткая связь
    private final Memory memory; // Композиция - жесткая связь
    private Storage storage; // Агрегация (мягкая связь)

    public Computer(String model, Storage storage) {
        this.model = model;
        this.storage = storage;
        this.processor = new Processor("AMD", "AMD-01", 3);
        this.memory = new Memory("Samsung", "M-02", 32);
    }

    public Computer(String model, Storage storage, int memoryCapacity) {
        this.model = model;
        this.storage = storage;
        this.processor = new Processor("AMD", "AMD-01", 3);
        this.memory = new Memory("Samsung", "M-02", memoryCapacity);
    }




    public void replaceStorage(Storage newStorage) {
        this.storage = newStorage;
        System.out.println("Установлен новый накопитель: " + newStorage.toString());
        System.out.println();

    }

    public String toString() {
        return String.format("Computer: {model: %S, memory: %s, storage: %s",
                model, processor.toString(), memory.getVolume(), storage.toString());

    }

    public void showInfo() {
        System.out.println("Компьютер: ");
        System.out.println(processor.toString());
        System.out.println(memory.toString());
        System.out.println(storage.toString());
        System.out.println();
    }

    public String getModel() {
        return model;
    }

    public Processor getProcessor() {
        return processor;
    }

    public Memory getMemory() {
        return memory;
    }

    public Storage getStorage() {
        return storage;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }
}
