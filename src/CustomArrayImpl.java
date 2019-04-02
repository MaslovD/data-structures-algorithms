package src;

public class CustomArrayImpl implements CustomArray {

    private static long[] longs;

    public CustomArrayImpl(int... element) {

        longs = new long[element.length];

        for (int x = 0; x < element.length; x++) {
            longs[x] = element[x];
        }
    }

    @Override
    public <T> void add(T element) {

    }

    @Override
    public <T> void find(T element) {

    }

    @Override
    public void sort() {

    }

    @Override
    public int lenght() {
        return 0;
    }

    @Override
    public void remove(int index) {

    }
}
