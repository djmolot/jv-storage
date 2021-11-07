package core.basesyntax;

import core.basesyntax.impl.StorageImpl;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Storage<Integer, String> storage = new StorageImpl<>();
        storage.put(1, "one");
        storage.put(2, "two");
        storage.put(3, "three");
        storage.put(3, "four");
        int size = storage.size();
        System.out.println("storage.size()=" + size);
        String value = storage.get(3);
        System.out.println("value with key equals 3 is \"" + value + "\"");
        String value1 = storage.get(5);// exception
    }
}