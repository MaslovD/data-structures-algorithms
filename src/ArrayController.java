package src;

import java.util.Scanner;

public class ArrayController extends DataStructureController {
    private CustomArrayImpl customArray;

    ArrayController() {

        welcomeMessage = "Welcome to the Array Controller!";
        customArray = new CustomArrayImpl(1, 2, 3, 4, 5);
    }

    @Override
    void list() {
        customArray.list();
    }

    @Override
    void add() {


        Scanner in = new Scanner(System.in);

        int valueToAdd = in.nextInt();

        customArray.add(valueToAdd);

    }


    @Override
    void find() {
        Scanner in = new Scanner(System.in);

        int valueToFind = in.nextInt();
        System.out.println(customArray.find(valueToFind));
    }

    @Override
    void delete() {

    }


    @Override
    void exit() {

        System.out.println("Bye, Bye....from Array controller");

    }

}
