package LoopsAndMethods;

public class LoopsAndMethods {

    private static int[] ARRAY = new int[] {
        1, 2, 3, 4, 5
    };

    public static void printWhile() {
        int i = 0;
        while (i < ARRAY.length) {
            System.out.println(ARRAY[i]);
            i++;
        }
    }
    
    public static void printDoWhile() {
        int i = 0;
        do {
            System.out.println(ARRAY[i]);
            i++;
        } while (i < ARRAY.length);
    }

    public static void printForLoop() {
        for (int i = 0; i < ARRAY.length; i++) {
            System.out.println(ARRAY[i]);
        }
    }

    public static void printForEach() {
        for (int i : ARRAY) {
            System.out.println(i);
        }
    }

    public static void printWithCondition(int num){
        for (int i = 0; i < ARRAY.length; i++) {
            if (ARRAY[i] == num) {
                System.out.println(ARRAY[i]);
            }
        }
    }
    

    public static void main(String[] args) {
        System.out.println("---|   While Loop   |---");
        printWhile();
        System.out.println("---| Do While Loop  |---");
        printDoWhile();
        System.out.println("---|    For Loop    |---");
        printForLoop();
        System.out.println("---| For Each Loop  |---");
        printForEach();
        System.out.println("---| With Condition |---");
        // in this case the example is 3 but the parameter could be any number
        printWithCondition(3);
    }
}
