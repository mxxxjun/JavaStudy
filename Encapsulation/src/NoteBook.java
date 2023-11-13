public class NoteBook {
    final String CPU;
    int memory;
    int storage;
    static final long GIGA = 1073741824L;

    NoteBook(String CPU, int memory, int storage){
        this.CPU = CPU;
        this.memory = memory;
        this.storage = storage;
    }

    void upgrade(int memory, int storage){
        this.memory = memory;
        this.storage = storage;
    }

    void printSpec(){
        System.out.print("CPU = " + CPU);
        System.out.print(" ,Memory = " + memory * GIGA + "바이트");
        System.out.println(" ,Storage = " + storage * GIGA + "바이트");
    }
}
