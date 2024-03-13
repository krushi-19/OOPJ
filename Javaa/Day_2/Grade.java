package Day_2;

import java.util.Scanner;


public class Grade {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);  
        System.out.print("Enter the grade:");
        int num = scanner.nextInt();

        char grade;

        if (num >= 90){
            grade = 'A' ;
            
        }
        else if (num >= 80){
            grade = 'B' ;
        }
        else if (num >= 60){
            grade = 'C' ;
        }
        else{
            grade = 'D' ;
        }

        System.out.println("The grade is :" + grade);
        
        

        


    }
    
}
