import java.util.Scanner;
class complex{
double real;
double imag;

complex(double real,double imag){
this.real=real;
this.imag=imag;
}

complex add(complex c){
return new complex(real+c.real,imag+c.imag);
}
complex sub(complex c){
return new complex(real-c.real,imag-c.imag);
}

complex multiply(complex c){
double r=real*c.real-imag*c.imag;
double i=real*c.imag+imag*c.real;
return new complex(r,i);
}

void display(){
if(imag >= 0){
System.out.println(real+" + "+imag+" i");
}else{
System.out.println(real+" - "+(-imag)+" i");
}
}
}

class complexNumber{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter the 1st number real part:");
double r1 = sc.nextDouble();
System.out.println("enter the 1st number imaginary part:");
double i1 = sc.nextDouble();
System.out.println("enter the 2nd number real part:");
double r2 = sc.nextDouble();
System.out.println("enter the 2nd number imaginary part:");
double i2 = sc.nextDouble();
complex c1 = new complex(r1,i1);
complex c2 = new complex(r2,i2);
System.out.println("addition:");
c1.add(c2).display();
System.out.println("subtraction:");
c2.sub(c1).display();
System.out.println("multiplication:");
c1.multiply(c2).display();
}
}