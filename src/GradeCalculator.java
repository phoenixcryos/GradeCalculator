// /*
//*Author: Richard Sharp
//*Date: 09/15/2023
//*Class: Java
//*project: Grade Calculator
//*/

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numberGrade;
        String letterGrade = "";

        System.out.println("Enter the number you received to calculate your letter grade:");

        numberGrade = input.nextInt();


        if (numberGrade >= 92) {
            letterGrade = "A";
        } else if ((numberGrade < 89) > 92) {
            letterGrade = "A-";
        } else if (numberGrade < 87 > 89) {
            letterGrade = "B+";
        } else if (numberGrade < 82 > 87) {
            letterGrade = "B";
        } else if (numberGrade < 79 > 82) {
            letterGrade = "B-";
        } else if (numberGrade < 77 > 79) {
            letterGrade = "C+";
        } else if (numberGrade < 72 > 77) {
            letterGrade = "C";
        } else if (numberGrade < 69 > 72) {
            letterGrade = "C-";
        } else if (numberGrade < 67 > 69) {
            letterGrade = "D+";
        } else if (numberGrade < 60 > 67) {
            letterGrade = "D";
        } else if (numberGrade < 0 > 60) {
            letterGrade = "F";
        } else {
            System.out.println("Incorrect entry. Grade value cannot be less than zero.");
            boolean b = numberGrade < 0.0;
            System.out.println("Your calculated letter grade is: " + letterGrade + " - Congratulations!");

            input.close();
        }
    }
}
