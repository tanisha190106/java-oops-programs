import java.util.Scanner;
class A{
void min(int n1,int n2){
if(n1<n2){
System.out.println("Minimum:"+n1);
}else{
System.out.println("Minimum:"+n2);}
}
}

class MinimumExample{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("enter the first number:");
int n1=sc.nextInt();
System.out.print("enter the second number:");
int n2=sc.nextInt();
A obj=new A();
obj.min(n1,n2);
}
}