package Arrays;

/******************************************************************************
 *  Compilation:  javac test.java
 *  Execution:    java test
 *
 *  Various ways of processing an array.
 *
 *  % java Deck
 *  find max number in an array
 *  find min number in an array
 *  reverse an array
 *  find mean of numbers in an array
 *  shuffle an array
 *  ...
 *
 ******************************************************************************/

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class test {
    /**Main Method*/
    public static void main(String[] args) {
        double[] myArray = {1.0,5,3,4,5,5};
        String[] fruits = {"apples", "bananas", "pine", "mango"};
        StdOut.println("The largest Number is " + Large( myArray) + " and smallest is " + Small(myArray));
        StdOut.println("The mean of " + Arrays.toString(myArray) + " is " + mean(myArray));
        List<String> list  = Arrays.asList(fruits);
        Collections.reverse(list);
        String[] reversed = list.toArray(fruits);
        StdOut.println("Array after reversed is " + Arrays.toString(reversed));

    }
    /**Largest Number*/
    public static double Large(double[] a) {
        double max = Double.NEGATIVE_INFINITY;
        int n = a.length;
        for (int i = 1; i < n; i++) {
            if (a[i] > max) max = a[i];
        }
        return  max;
    }

    /**Smallest Number*/
    public static double Small(double[] a) {
        double min = Double.POSITIVE_INFINITY;
        int n = a.length;
        for (int i = 0; i < n; i++) {
            if (a[i] < min) min = a[i];
        }
        return  min;
    }

    /**Shuffling */
    public static void exchange(double[] a, int i, int j) {
            //swap myList[i] with myList[j]
            double temp = a[i];
            a[i] = a[j];
            a[j] = temp;
    }
    /**Return random integer between 0 & n-1*/
    public static int uniform(int n) {
        return (int) (Math.random() * n);
    }

    /**an array of strings and arrange them in random order*/
    public static void shuffle(double[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int r = i + uniform(n-1);
            exchange(a, i, r);
        }
    }

    /**Average of the array values*/
    public static double mean(double[] a) {
        int n = a.length;
        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
        }
        return sum / n;
    }

    /**Reverse values in array*/
    public static void reverse(double[] a) {
        int n = a.length;
        int j = (int) (Math.random() * n);
        for (int i = 0; i < n/2; i++) {
            double temp = a[i];
            a[i] = a[n-1-i];
            a[n-i-1] = temp;
        }
    }
}
