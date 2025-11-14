import java.util.Scanner;
class addTwoNumbers{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("enter the first number:");
int n1=sc.nextInt();
System.out.print("enter the second number:");
int n2=sc.nextInt();
int sum=n1+n2;
System.out.println("the sum of "+n1+" and "+n2+" is "+sum);
}
}