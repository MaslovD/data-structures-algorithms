package src;

import java.util.Scanner;

@SuppressWarnings({"ForLoopReplaceableByForEach", "ManualArrayCopy"})
public class Main {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        int actionId;


        do {
            System.out.println("Select Data Structure You Want To Test (0-exit, 1-array, 2-list, 3-stack, 4-queue, 5-set 6=hashmap, 7-hashtable):");

            actionId = in.nextInt();

            switch (actionId) {

                case 0: {
                    System.out.println("Bye, Bye....");

                    System.exit(0);

                    break;
                }

                case 1: {
                    ArrayController arrayController = new ArrayController();
                    arrayController.mainSelector();
                    break;
                }
                case 2: {
                    break;
                }

            }

        } while (actionId != 0);

    }


}
