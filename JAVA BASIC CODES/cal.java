import java.util.Scanner;

public class cal{

 public static void main(String[] args){

  Scanner sc = new Scanner(System.in);
  System.out.println("Enter First no : ");
  int no1 = sc.nextInt();
 System.out.println("Enter Second no : ");
  int no2 = sc.nextInt();
 System.out.println("Select symbol(+,-,*,/)");
 String symbol=sc.next();
  int res;
 switch(symbol){
   case "+" : res=no1+no2;
              System.out.println("Addition is "+res);
               break;
 case "-" : res=no1-no2;
              System.out.println("Subtraction is "+res);
               break;

 case "*" : res=no1*no2;
              System.out.println("Multiplication is "+res);
               break;
 case "/" : res=no1/no2;
              System.out.println("Division is "+res);
               break;
default :   System.out.println("Invalid symbol");




}




  
}



}
