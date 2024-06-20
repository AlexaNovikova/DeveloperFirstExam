package ru.novikova;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите размер массива строк");
        int n = scanner.nextInt();
        String[] strings = new String[n];
        scanner.nextLine();
        for (int i = 0; i < strings.length; i++) {
            System.out.println("Введите строку " + i + " и нажмите Enter");
            strings[i] = scanner.nextLine();
        }
        scanner.close();
        String[] updated = updateStrings(strings);
        System.out.println(Arrays.toString(updated));
    }

    private static String[] updateStrings(String[] strings) {
        int size = 0;
        for (String string : strings) {
            if (string.length() <= 3) {
                size++;
            }
        }
        String[] result = new String[size];
        size = 0;
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].length() <= 3) {
                result[size] = strings[i];
                size++;
            }
        }
        return result;
    }
}