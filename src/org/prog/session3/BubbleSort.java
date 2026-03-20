package org.prog.session3;


import java.util.Random;
import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        Random random = new Random();
        int[]numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10);
            System.out.println("Before sort:");
            System.out.println(Arrays.toString(numbers));
        }
        boolean swapped;
        for (int j = 0; j < numbers.length - 1; j++) {
                swapped = false;

            for (int i = 0; i < numbers.length - 1 - j; i++) {
                System.out.println("checking" + i + "and" + (i +1));

                if (numbers[i] > numbers[i + 1]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                    swapped = true;
                    System.out.println("swapped"+ i + "and" + (i + 1));
                }
            }
            if (!swapped) {
                System.out.println("array is already sorted");
                break;
            }
        }
        System.out.println("After sort:");
        System.out.println(Arrays.toString(numbers));
                }

            }
//test

