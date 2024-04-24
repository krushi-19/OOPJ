public class reverseNo{
static int rev=0;
 
  static void rev1(int n){
 
  
  
  if(n == 0){
  return;
}
 int rem = n%10;
  rev = rev*10+rem;
   rev1(n/10);

  int no = 5432;
   LOGIC;- DIVIDE NO BY 10 
    we will get quotient and rem then again divide by 10 
    int rev = 0
    rev = rev*10 + rem
       0*10+2 = 2  
       2*10+3= 23
       23*10+4 = 234
      234*10+5 = 2345

    int no = 5432, rem = 0, rev=0;
   while(no != 0){
    rem = no%10;
    rev = rev*10+rem;
    no = no / 10 ....> quotient provide karega. 
   }
   sop(rev);S

    

    
 


}
  

public static void main(String[] args){
 rev1(1234);
System.out.println(rev);
 

}






}
