package org.example;

import java.util.Scanner;

public class App {
    private int amountOfElements;
    private int tempElement;
    private Scanner scanner;

    public App() {
        this.scanner = new Scanner(System.in);
    }

    public void StartApp() {
        System.out.println("Please enter amount of elements in array");
        amountOfElements = scanner.nextInt();
        int myArray [] = new int [amountOfElements];
        for (int i =0; i < amountOfElements; i++) {
            System.out.println("Please enter the next array element");
            tempElement = scanner.nextInt();
            myArray[i] = tempElement;
        }
        sortArray(myArray);
        System.out.println("Array after sorting:");
        for (int e: myArray) {
            System.out.println(e);
        }
    }

    public int [] sortArray(int [] array) {
        boolean swapped = true;
        int j = 0;
        int tmp;
        while (swapped) {
            swapped = false;
            j++;
            for (int i = 0; i < array.length - j; i++) {
                if (array[i] > array[i + 1]) {
                    tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                    swapped = true;
                }
            }
        }
        return array;
    }
}


