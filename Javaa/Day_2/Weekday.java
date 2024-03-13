package Day_2;

import java.util.Scanner;

public class Weekday {



    public static void main(String[] args) {
    
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number ");
        
        int dayName = scanner.nextInt();

        String WeekName = " " ;

        switch(dayName){

            case 1 : WeekName = "Sunday";
                     break;
            
            case 2 : WeekName = "Monday";
                     break;
            case 3 : WeekName = "Tuesday";
                     break;
            case 4 : WeekName = "Wednesday";
                     break;
            case 5 : WeekName = "Thursday";
                     break;
            case 6 :  WeekName = "Friday";
                     break;
            case 7 :  WeekName = "Saturday";
                     break;

            
           

        }
           System.out.println(WeekName);

           scanner.close();

        
    }
}
