package src;

import src.CustomArrayImpl;
import src.DataStructureController;

import java.util.Scanner;

public class ArrayController extends DataStructureController {

    private long[] longs = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

    ArrayController() {

        welcomeMessage = "Welcome to the Array Controller!";

        CustomArrayImpl customArray = new CustomArrayImpl(1, 2, 3, 4, 5);
    }

    @Override
    void list() {
        System.out.println("Array contains:");

        for (int x = 0; x < longs.length; x++) {

            System.out.print(String.format("[%s]", longs[x]));

        }

        System.out.println();
    }

    @Override
    void add() {

        Scanner in = new Scanner(System.in);

        int valueToAdd = in.nextInt();

        long[] newLongs = new long[longs.length + 1];

        for (int x = 0; x < longs.length; x++) {
            newLongs[x] = longs[x];
        }

        newLongs[newLongs.length - 1] = valueToAdd;

        longs = newLongs;

        list();

    }

    @Override
    void exit() {

        System.out.println("Bye, Bye....from Array");

    }

}
