//package DZ3_JAVA_Collections;

//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Task3 {

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

        System.out.print("Мин.число = " + searchMinInArrayList(listNum, lengthList) + "\n");
        System.out.print("Макс.число = " + searchMaxInArrayList(listNum, lengthList) + "\n");
                
        double res = averageArrayList(listNum, lengthList);                
        System.out.printf("Среднее списка = %.2f \n", res);

    }

    public static int searchMinInArrayList(ArrayList<Integer> listNum, int length) {

        int minNum = listNum.get(0);

        for (int i = 0; i < length; i++) {

            int currentNum = listNum.get(i);

            if (minNum > currentNum) {

                minNum = listNum.get(i);

            }

        }

        return minNum;

    }

    public static int searchMaxInArrayList(ArrayList<Integer> listNum, int length) {

        int maxNum = listNum.get(0);

        for (int i = 0; i < length; i++) {

            int currentNum = listNum.get(i);

            if (maxNum < currentNum) {

                maxNum = listNum.get(i);

            }

        }

        return maxNum;

    }

    public static double averageArrayList(ArrayList<Integer> listNum, int length) {

        double average = 0;

        for (int i = 0; i < length; i++) {

            average = average + listNum.get(i);
        }

        double result = average / length;
        return result;

    }

    // метод генерации случайного числа от 0 до upperRange

    public static int generateRandomInt(int upperRange) {

        Random random = new Random();
        return random.nextInt(upperRange);

    }
}

