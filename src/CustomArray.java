package src;

public interface CustomArray {
    <T> void add(T element);

    <T> void find(T element);

    void sort();

    int lenght();

    void remove(int index);
}