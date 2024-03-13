package Day_2;

import java.util.Scanner;

public class BMI {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter weight");
    double weight = sc.nextDouble();
    System.out.println("Enter height");
    double height = sc.nextDouble();

    double bmi = weight / (height*height);

    System.out.println("BMI is :" + bmi);
    if(bmi < 18.5){
        System.out.println("Underweight");
    }
    else if (bmi >=18 && bmi <= 24.9){
        System.out.println("Normal weight");
    }
    else if (bmi >= 25.0 && bmi >= 29.9){
        System.out.println("Overweight");


    }
    else{
        System.out.println("Invalid");
    }
    
    
   

    sc.close();



    
    
}
}
