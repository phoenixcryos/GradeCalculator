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

        double numberGrade; 
        String letterGrade = "";

        System.out.println("Please enter your grade:");

        numberGrade = input.nextDouble(); // Using nextDouble method to get decimal values

        if (numberGrade < 0) {
            System.out.println("Grade value cannot be less than zero.");
            input.close();
            return;
        } else if (numberGrade >= 92) {
            letterGrade = "A";
        } else if (numberGrade >= 89) {
            letterGrade = "A-";
        } else if (numberGrade >= 87) {
            letterGrade = "B+";
        } else if (numberGrade >= 82) {
            letterGrade = "B";
        } else if (numberGrade >= 79) {
            letterGrade = "B-";
        } else if (numberGrade >= 77) {
            letterGrade = "C+";
        } else if (numberGrade >= 72) {
            letterGrade = "C";
        } else if (numberGrade >= 69) {
            letterGrade = "C-";
        } else if (numberGrade >= 67) {
            letterGrade = "D+";
        } else if (numberGrade >= 60) {
            letterGrade = "D";
        } else {
            letterGrade = "F";
        }
        
        System.out.println("Your grade is " + letterGrade + ".");
        input.close();
    }
}
