class Swap{

 public static void main(String[] args){
   int a = 10,b=20;
   int t;
   t=a;
   a=b;
   t=b;
  System.out.println("a:"+a);
System.out.println("b:"+b);


  without 3rd variable:- 

   a=a+b; /// a = 10+20 = 30
  b= a-b;  // 30-20 = 10
  a = a -b // 30 -10 
   



}

}
