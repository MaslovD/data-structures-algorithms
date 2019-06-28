package src;

public class CustomArrayImpl implements CustomArray {

    private int[] ints;

    public CustomArrayImpl(int... element) {

        ints = new int[element.length];

        for (int x = 0; x < element.length; x++) {
            ints[x] = element[x];
        }
    }

    public CustomArrayImpl(int initialArraySize) {
        ints = new int[initialArraySize];
    }


    @Override
    public void add(int value) {

        int[] newInts = new int[ints.length + 1];

        for (int x = 0; x < ints.length; x++) {
            newInts[x] = ints[x];
        }

        newInts[ints.length] = value;

        ints = newInts;
    }

    @Override
    public int find(int value) {
        for (int x = 0; x < ints.length; x++) {
            if (ints[x] == value) return x;
        }
        return -1;
    }

    @Override
    public int get(int index) {
        return ints[index];
    }


    @Override
    public void sort() {

    }

    @Override
    public int length() {
        return ints.length;
    }

    @Override
    public void remove(int index) {

    }

    @Override
    public void list() {
        StringBuilder valueStringBulder = new StringBuilder();
        StringBuilder indexStringBulder = new StringBuilder();

        System.out.println("Array contains:");

        for (int x = 0; x < ints.length; x++) {
            valueStringBulder.append(String.format("[%3s]", ints[x]));
            indexStringBulder.append(String.format("[%3s]", x));
        }

        System.out.println(valueStringBulder.toString());
        System.out.println(indexStringBulder.toString());
    }

    @Override
    public void set(int pos, int value) {

    }
}
