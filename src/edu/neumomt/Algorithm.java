package edu.neumomt;

public class Algorithm {

    public static int sqr(int a) {
        return a * a;
    }

    public static int min(int a, int b) {
        return (a <= b) ? a : b;
    }

    public static int max(int a, int b) {
        return (a >= b) ? a : b;
    }


    public static int abs(int a) {
        return (a < 0) ? -a : a;
    }


    public static boolean contains(int[] array, int value) {
        for (var element : array) {
            if (element == value) {
                return true;
            }
        }
        return false;
    }

    public static int size(int[] array) {
        int total = 0;
        for (var element : array) {
            total++;
        }
        return total;
    }

    public static int indexOf(int[] array, int value) {
        for (int i = 0; i < size(array); i++) {
            if (array[i] == value) return i;
        }
        return -1;
    }

    public static int sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < size(array); i++) {
            sum += array[i];
        }
        return sum;
    }

    public static double average(int[] array) {
        return sum(array) / (double) size(array);
    }

    public static int max(int[] array) {
        int max = array[0];
        for (int i = 0; i < size(array); i++) {
            if (array[i] > max) max = array[i];
        }
        return max;
    }

    public static int min(int[] array) {
        int min = array[0];
        for (int i = 0; i < size(array); i++) {
            if (array[i] < min) min = array[i];
        }
        return min;
    }

    public static void print(int[] array) {
        for (var element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void reverse(int[] array) {
        for (int i = 0; i < size(array) / 2; i++) {
            int i1 = array[i];
            int i2 = array[(size(array) - 1) - i] ;
            int temp = i2;
            i2 = i1;
            i1 = temp;
            array[i] = i1;
            array[(size(array) - 1) -i] = i2;
        }
    }
}
