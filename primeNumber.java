import java.util.Scanner;
class prime{
void isPrime(int n){
int count=0;
if(n<0){
System.out.println("invalid");
}
for(int i=1;i<=n;i++){
if(n%i==0){
count++;
}
}
if(count==2){
System.out.println(n+" is a prime number");
}
else{
System.out.println(n+" is not a prime number");}
}
}

class primeNumber{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("enter a number:");
int num=sc.nextInt();
prime p=new prime();
p.isPrime(num);
}
}