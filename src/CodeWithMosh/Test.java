package CodeWithMosh;

public class Test {

    public static void main(String[] args) {
        HashTable table = new HashTable();
        table.put(6, "A");
        table.put(8, "B");
        table.put(11, "C");
        table.remove(8);

        System.out.println(table.get(11));
    }
}