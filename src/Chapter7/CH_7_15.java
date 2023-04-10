package Chapter7;
/*
(Command-Line Arguments) Rewrite Fig. 7.2 so that the size of the array is specified by the
first command-line argument. If no command-line argument is supplied, use 10 as the default size
of the array
 */

import java.util.Scanner;

//public class CH_7_15 {
//    public static void main(String[] args) {
//
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter size of array:");
//        String arraySize = input.nextLine();
//
//        if (arraySize.equals("") || arraySize.equals(" ")) {
//            int[] array = new int[10];
//           System.out.printf("%s%8s%n", "Index", "Value");
//           for (int counter = 0; counter < array.length; counter++)
//                System.out.printf("%5d%8d%n", counter, array[counter]);
//        } else {
//            Integer x = Integer.valueOf(arraySize);
//            int[] array = new int[x];
//            System.out.printf("%s%8s%n", "Index", "Value");
//            for (int counter = 0; counter < array.length; counter++)
//                System.out.printf("%5d%8d%n", counter, array[counter]);
//        }
//    }
//}

public class CH_7_15 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of array:");
        String arraySize = input.nextLine();

        if (arraySize.equals("") || arraySize.equals(" ")) {
            int x = 10;
            displayArray(10);
        } else {
            Integer x = Integer.valueOf(arraySize);
            displayArray(x);
        }

    }

    public static void displayArray(int x) {
        int[] array = new int[x];
        System.out.printf("%s%8s%n", "Index", "Value");
        for (int counter = 0; counter < array.length; counter++)
            System.out.printf("%5d%8d%n", counter, array[counter]);
    }
}