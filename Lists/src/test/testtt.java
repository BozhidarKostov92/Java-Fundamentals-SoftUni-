package test;

import java.util.Scanner;

public class testtt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        Напишете програма, която да пресмята статистика на оценки от изпит.
        В началото програмата получава броят на студентите явили се на изпита
        и за всеки студент неговата оценка. На края програмата трябва да изпечата
         процента на студенти с оценка между 2.00 и 2.99, между 3.00 и 3.99, между
         4.00 и 4.99, 5.00 или повече. Също така и средният успех на изпита.

         Ред 1 -	"Top students: {процент студенти с успех 5.00 или повече}%"
        Ред 2 -	"Between 4.00 and 4.99: {между 4.00 и 4.99 включително}%"
        Ред 3 -	"Between 3.00 and 3.99: {между 3.00 и 3.99 включително}%"
        Ред 4 -	"Fail: {по-малко от 3.00}%"
        Ред 5 -	"Average: {среден успех}"
        Всички числа трябва да са форматирани до вторият знак след десетичната запетая.
         */
        int studentCount = Integer.parseInt(scanner.nextLine());

        int groupFail = 0;
        int group2 = 0;
        int group3 = 0;
        int groupTop = 0;
        double sum = 0;
//
//        double group1Percentage = 0;
//        double group2Percentage = 0;
//        double group3Percentage = 0;
//        double group4Percentage = 0;

        for (int i = 1; i <= studentCount; i++) {
            double grade = Double.parseDouble(scanner.nextLine());
            
            sum += grade;
            
             if (grade < 3) {
                groupFail ++;
            } else if (grade >= 3) {
                group2 ++;
            } else if (grade < 5) {
                group3 ++;
            } else {
                groupTop ++;
            }

        }

        /*
        Ред 1 -	"Top students: {процент студенти с успех 5.00 или повече}%"
Ред 2 -	"Between 4.00 and 4.99: {между 4.00 и 4.99 включително}%"
Ред 3 -	"Between 3.00 and 3.99: {между 3.00 и 3.99 включително}%"
Ред 4 -	"Fail: {по-малко от 3.00}%"
Ред 5 -	"Average: {среден успех}"

         */

        System.out.printf("Top students: %.2f%%\n", 1.0 * groupTop / studentCount * 100);
        System.out.printf("Between 4.00 and 4.99: %.2f%%\n", 1.0 * group3 / studentCount * 100);
        System.out.printf("Between 3.00 and 3.99: %.2f%%\n", 1.0 * group2 / studentCount * 100);
        System.out.printf("Fail: %.2f%%\n", 1.0 * groupFail / studentCount * 100);
        System.out.printf("Average: %.2f\n", sum / studentCount);
    }
}

