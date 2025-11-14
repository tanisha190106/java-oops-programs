import java.util.Scanner;
class TravelPackage{
String TravelCode;
int NoofAdults;
int NoofKids;
int Kilometers;
float TotalFare;

TravelPackage(){
TravelCode = null;
NoofAdults = 0;
NoofKids = 0;
Kilometers = 0;
TotalFare = 0.0f;
}

void AssignFare(){
int FarePerPerson;
if(Kilometers >= 1000){
FarePerPerson = 500;
}else if(Kilometers < 1000 && Kilometers >=500){
FarePerPerson = 300;
}else{
FarePerPerson = 200;
}
float adultFare = NoofAdults * FarePerPerson;
float kidFare = NoofKids * (0.5f * FarePerPerson);
TotalFare = adultFare + kidFare;
}

void EnterTour(){
Scanner sc = new Scanner(System.in);
System.out.print("Enter Travel Code: ");
TravelCode = sc.nextLine();
System.out.print("Enter No. of Adults: ");
NoofAdults = sc.nextInt();
System.out.print("Enter No. of Kids: ");
NoofKids = sc.nextInt();
System.out.print("Enter Kilometers: ");
Kilometers = sc.nextInt();

AssignFare();
}

void ShowTour(){
System.out.println("\n--- Travel Package Details ---");
System.out.println("Travel Code : " + TravelCode);
System.out.println("Adults      : " + NoofAdults);
System.out.println("Kids        : " + NoofKids);
System.out.println("Kilometers  : " + Kilometers);
System.out.println("Total Fare  : Rs " + TotalFare);
}
}

class TravelPackageMain{
public static void main(String[] args){
TravelPackage tp = new TravelPackage();
tp.EnterTour();
tp.ShowTour();
}
}
