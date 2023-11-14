public class Notebook {
    final String CPU;
    int memory;
    int storage;

    Notebook(String CPU, int memory, int storage){
        this.CPU = CPU;
        this.memory = memory;
        this.storage = storage;
    }

    void printSpec(){
        System.out.print("CPU = " + CPU);
        System.out.print(" ,Memory = " + memory);
        System.out.println(" ,Storage = " + storage);
    }
}
