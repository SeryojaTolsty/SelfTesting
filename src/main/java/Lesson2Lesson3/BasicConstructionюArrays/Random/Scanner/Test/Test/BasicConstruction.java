package Lesson2Lesson3.BasicConstructionюArrays.Random.Scanner.Test.Test;

public class BasicConstruction {

    public static void main(String[] args) {
        ///switcher();
        //ifElse();
        //foriPlusIfElse();
        //foriMinusIfElse();
        //forEach();
        //entryCycles();
        //whileCicles();
        //mathTestTryCatch();
        //massiveArr();
        //tableMassive();
        //minMaxArray();
    }

    private static void switcher() {
        int a = 3;
        switch (a) {
            case 1:
                a = 1;
                System.out.println("a = 1");
                break;
            case 2:
                a = 2;
                System.out.println("a = 2");
                break;
            case 3:
                a = 3;
                System.out.println("a = 3");
                break;
            default:
                System.out.println("'а' не принадлежит числовому диапазону");
                break;
        }
    }


    private static void ifElse() {
        int a = 67;
        if (a == 1) {
            System.out.println("a = 1");
        } else if (a == 2) {
            System.out.println("a = 2");
        } else if (a >= 60) {
            if (a == 60) {
                System.out.println("a = 60");
            } else if (a == 67) {
                System.out.println("a = 67");
            }
            System.out.println("maybe");
        } else {
            System.out.println("'a' не принадлежит числовому диапазону");
        }
    }


    private static void foriPlusIfElse() {
        System.out.println("хуёв");
        for (int i = 1; i <= 5; i++) {
            if (i == 1) {
                System.out.println(i + " хуй");
            } else if (i > 1 && i < 5) {
                System.out.println(i + " хуя");
            } else {
                System.out.println(i + " хуёв");
            }
        }
        System.out.println("конец");
    }


    private static void foriMinusIfElse() {
        for (int i = 5; i >= 0; i--) {
            if (i == 5) {
                System.out.println(i + " хуёв");
            } else if (i >= 2) {
                System.out.println(i + " хуя");
            } else if (i == 1) {
                System.out.println(i + " хуй");
            }
        }
        System.out.println("хуёв");
    }


    private static void forEach() {
        String[] arr = {"a", "b", "c", "d"};
        for (String plus : arr) {
            System.out.println("plus = " + plus);
        }
    }


    private static void entryCycles() {
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 5; j++) {
                if (i == 3) {
                    System.out.println("хуй");
                }
            }

        }
    }


    private static void whileCicles() {
        for (int i = 0; i < 10; i++) {
            while (i < 5) {
                System.out.println("хуй");
                break;
            }
            while (i >= 5) {
                System.out.println("пизда");
                break;
            }

        }
    }


    private static void mathTestTryCatch() {
        int a = 0, b = 10, c = 0;
        try {
            int d = a / c + b;
        } catch (Exception e) {
            System.out.println("ноль не делится на ноль");
            ;
        }
    }


    private static void massiveArr() {
        int[] arr = new int[10];

        for (int a : arr) {
            System.out.print(a);  //обычное прохождение по целочисленному массиву, у которого пустые ячейки
        }
        System.out.println();
        for (int i = 1; i <= arr.length; i++) {
            System.out.print(i);   //прохождение по массиву циклом с последующим присвоением значений
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
            System.out.print(arr[i] = i);   //определение незаданных значений у массива через цикл fori
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + (arr[i] + 1)); //вывод ячеек и значений в консоль с последующим переопределением
        }
    }


    private static void tableMassive() {
        int counter = 1;
        int[][] table = new int[3][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                table[i][j] = counter;
                System.out.print(table[i][j] + " ");
                counter++;
            }
            System.out.println();
        }

    }


}
