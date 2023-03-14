//package DZ3_JAVA_Collections;

//Пусть дан произвольный список целых чисел, удалить из него чётные числа

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите длину списка: ");
        int lengthList = in.nextInt();
        in.close();

        ArrayList<Integer> listNum = new ArrayList<>();

        System.out.print("Исходный список: ");

        
        for (int i = 0; i < lengthList; i++) {

            // добавляем в список случайные числа от 0 до 99
            listNum.add(generateRandomInt(100));
            System.out.print(listNum.get(i) + " ");

        }

        System.out.println();

        printArrayList(listNum, lengthList);

    }

    public static void printArrayList(ArrayList<Integer> listNum, int length) {

        System.out.print("Список с удаленными четными: ");

        for (int i = 0; i < length; i++) {
            
            if (listNum.get(i) % 2 == 1) {

                System.out.print(listNum.get(i) + " ");

            }

        }

    }

    // метод генерации случайного числа от 0 до upperRange

    public static int generateRandomInt(int upperRange) {

        Random random = new Random();
        return random.nextInt(upperRange);

    }

}

