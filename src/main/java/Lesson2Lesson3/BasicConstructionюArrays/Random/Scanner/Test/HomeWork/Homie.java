package Lesson2Lesson3.BasicConstructionюArrays.Random.Scanner.Test.HomeWork;

import java.util.*;

public class Homie {
//    private static Object Random;
//    private static Object Scanner;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введи номер метода: ");
        int loc = in.nextInt();
        switch (loc) {

            case 1:
                loc = 1;
                integerArray();
                break;
            case 2:
                loc = 2;
                hollowEightArray();
                break;
            case 3:
                loc = 3;
                lessThenSix();
                break;
            case 4:
                loc = 4;
                slashArr();
                break;
            case 5:
                loc = 5;
                minMaxArray();
                break;
            case 6:
                loc = 6;
                balanceArray(2, 2, 2, 1, 2, 2, 10, 1);
                break;
            case 7:
                loc = 7;
                rotateA();
            default:
                System.out.println("Ликёро-водочный завод на сегодня нарядов не прислал");
                break;
            }
        Scanner close;
    }


        //integerArray();
        //hollowEightArray();
        //lessThenSix();
        //slashArr();
        //minMaxArray();
//        balanceArray(2, 2, 2, 1, 2, 2, 10, 1);
/*        int[] arr = {2, 2, 2, 1, 2, 2, 10, 1};
//        System.out.print(balanceArray(a));
        rotateA();*/

//    }

    private static void integerArray() {
        int[] a = {1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0};
        for (int b : a) {
            if (b == 1) {
                b = 0;
            } else {
                b = 1;
            }
            System.out.print(b);

        }
    }


    private static void hollowEightArray() {
        int[] a = new int[8];
        for (int i = 0; i <= a.length; i++) {
            System.out.print(i * 3 + " ");
        }
    }


    private static void lessThenSix() {
        int[] a = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int b : a) {
            if (b < 6) {
                b = b * 2;
            }
            System.out.print(b + " ");
        }
    }


    private static void slashArr() {
        int[][] a = new int[5][5];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (i == j || i + j == a.length - 1) {
                    a[i][j] = 1;
                }
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }


    private static void minMaxArray() {
        int[] a = new int[5];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 10);
        }
        for (int b : a) {
            System.out.print(b + " ");
        }
        System.out.println();
        int min = a[0];
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (min > a[i]) {
                min = a[i];
            } else if (max < a[i]) {
                max = a[i];
            }
        }
        System.out.println("min = " + min + ", max = " + max);
    }


    private static boolean balanceArray(int... arr) {
        //System.out.print(balanceArray(a));
        for (int b : arr) {
            System.out.print(b + " ");
        }
        System.out.println();
        boolean b = false;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count = count + arr[i];
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            if (sum == count - sum) {
                b = true;
            }
        }
        return b;
    }

    private static ArrayList<Integer> rotateA() {
        int[] a = {1, 2, 3, 4, 5};
        ArrayList<Integer> b = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            Collections.addAll(b,a[i]);
        }
        System.out.println(b);
        Collections.rotate(b,-3);
        System.out.println(b);
        return b;
    }
}


