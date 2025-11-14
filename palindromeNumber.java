import java.util.Scanner;
class palindrome{
void isPalindrome(int n){
int temp=n;
int d,sum=0;
while(n!=0){
d=n%10;
sum=sum*10+d;
n=n/10;
}
if(temp==sum){
System.out.println(temp+" is a palindrome number");
}else{
System.out.println(temp+" is not a palindrome number");
}
}
}

class palindromeNumber{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("enter a number:");
int num=sc.nextInt();
palindrome palin = new palindrome();
palin.isPalindrome(num);
}
}