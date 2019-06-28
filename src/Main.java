package src;

import java.util.Scanner;

@SuppressWarnings({"ForLoopReplaceableByForEach", "ManualArrayCopy"})
public class Main {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        int actionId;


        do {
            System.out.println("------------------------------------\n" +
                    "Select Data Structure you want to play with: \n" +
                    "1: array\n" +
                    "2: list \n" +
                    "3: stack\n" +
                    "4: queue\n" +
                    "5: set\n" +
                    "6: hashmap\n" +
                    "7: hashtable\n" +
                    "0: exit");

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
