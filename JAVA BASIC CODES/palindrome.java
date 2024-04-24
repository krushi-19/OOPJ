palindrome == 121 .. aanu revese laris toh 121 aavse

concept:- rev a no 
psvm(){

int no =121;
int temp = no;
int rev=0,rem;

while(temp != 0){
rem= temp%10;
rev = rev*10+rem;
temp = temp/10;


}

if(no == rev){
sop(no+ "is palindrome no ");

}
else{

sop( no + "is not a palindrome no ");

}


}