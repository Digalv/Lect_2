package com.company;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        task();
    }
    private static void task() {
        System.out.print("Enter size of array   ");
        int masive_size = scanner.nextInt();
        System.out.print("Enter k ");
        int ammount = scanner.nextInt();
        System.out.print("Enter n ");
        int swap = scanner.nextInt();
        if (masive_size <= 100)
        {
            System.out.println("\nYour array < 100. Enter the new data: ");
            task();
        }
        else
        {
            int[] box = new int[masive_size];
            for (int i = 0; i < box.length; i++) {
                box[i] = (int) (Math.random() * 100 + 1);
            }
            System.out.println("Start: ");
            System.out.println(Arrays.toString(box));
            System.out.println("Finish: ");
            int num = masive_size / ammount;
            for (int i = 0; i < swap; i++) {
                for (int j = 0; j < num * ammount; j += ammount) {
                    int index = (int) (Math.random() * num);
                    for (int k = 0; k < ammount; k++) {
                        int a = box[k + k];
                        box[k + k] = box[k + (index * ammount)];
                        box[k + (index * ammount)] = a;
                    }
                }
                System.out.println(Arrays.toString(box));
            }
        }
    }
}