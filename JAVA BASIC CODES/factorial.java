import java.util.Scanner;

public class factorial{

 public static void main(String[] args){

  Scanner sc = new Scanner(System.in);
  System.out.println("Enter no");
  int no = sc.nextInt();
  int fact=1;
  for(int i=1; i<=no;i++){
   fact = fact*i;

}
  System.out.println("fact is :"+fact);



}



}

// 5 -> 5*4*3*2*1 = 120;

logic:-
 int no =5; fact = 1;
for(int i 1; i<= no; i++)
 fact = fact *i;
       1*1=1
        1*2
        2*3= 6
        6*4 = 24
        24 * 5 = 120
   
        
