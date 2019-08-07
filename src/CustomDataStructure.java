package src;

public interface CustomArray {
    <T> void add(T element);

    <T> void find(T element);

    void sort();

    int length();

    void remove(int index);
}