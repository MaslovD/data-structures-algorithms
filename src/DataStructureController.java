package src;

import java.util.Scanner;

public class DataStructureController {

    String welcomeMessage;
    String selectorMessage = "Please choose operation (0-exit, 1-list, 2-add, 3-delete, 4-sort, 5-find)";

    void mainSelector() {
        Scanner in = new Scanner(System.in);

        int actionId;

        System.out.println(welcomeMessage);

        do {
            System.out.println(selectorMessage);
            actionId = in.nextInt();

            switch (actionId) {

                case 0: {
                    exit();
                    break;
                }

                case 1: {
                    list();
                    break;
                }

                case 2: {
                    add();
                    break;
                }

                case 5: {
                    find();
                    break;
                }
            }


        } while (actionId != 0);
    }

    void list() {

    }

    void add() {

    }

    void find() {

    }

    void delete() {

    }


    void exit() {

        System.out.println("Bye, Bye....");

        System.exit(0);
    }
}
