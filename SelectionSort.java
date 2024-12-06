/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package selectionsort;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class SelectionSort {

    /**
     * @param args the command line arguments
     */
    public static void selectionSort(double[] array, int startIndex) {
        int n = array.length;

        for (int i = startIndex; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            double temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    public static void printArray(double[] array) {
        for (double value : array) {
            System.out.printf("%.2f ", value);
        }
        System.out.println();
    }

    public static void main(String[] args) {

        double[] array = new double[50];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextDouble() * 100;
        }

        System.out.println("Array before sorting:");
        printArray(array);

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter the starting index for sorting (0 to 49): ");
        int startIndex = scanner.nextInt();

        while (startIndex < 0 || startIndex >= array.length) {
            System.out.print("Invalid index. Please enter a value between 0 and 49: ");
            startIndex = scanner.nextInt();
        }

        selectionSort(array, startIndex);

        System.out.println("\nArray after sorting:");
        printArray(array);

        scanner.close();
    }

}
