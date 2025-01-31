import java.sql.SQLData;
import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter your percentage: ");
//        double percentage = input.nextDouble();

//        if (percentage >= 70 && percentage <= 100) {
//            System.out.println("First Classification");
//        } else if (percentage > 100) {
//            System.out.println("False percentage");
//        }else if (percentage >= 60) {
//            System.out.println("2:1 Classification");
//        } else if (percentage >= 50) {
//            System.out.println("2:2 Classification");
//        } else if (percentage >= 40) {
//            System.out.println("3rd Classification");
//        } else if (percentage < 40 && percentage > 0) {
//            System.out.println("Fail");
//        } else {
//            System.out.println("False percentage");
//        }

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Maximum mark on your exam: ");
        double maxMark = input.nextDouble();

        Scanner inputMark = new Scanner(System.in);
        System.out.print("Enter your Mark on your exam: ");
        double mark = inputMark.nextDouble();

        double result = (mark / maxMark) * 100;
//        System.out.println("Your Mark is: " + result);

        if (result >= 70 && result <= 100) {
            System.out.println("First Classification");
        } else if (result > 100) {
            System.out.println("False percentage");
        }else if (result >= 60) {
            System.out.println("2:1 Classification");
        } else if (result >= 50) {
            System.out.println("2:2 Classification");
        } else if (result >= 40) {
            System.out.println("3rd Classification");
        } else if (result < 40 && result > 0) {
            System.out.println("Fail");
        } else {
            System.out.println("False percentage");
        }



    }
}