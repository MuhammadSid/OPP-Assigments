class Pen{

String Company;
int Price;
String Type ;


public static void main(String[]args){
	Pen BallPointer= new Pen();
	BallPointer.Company="Dollar";
	BallPointer.Price= 10;
    BallPointer.Type= "Blue";
	System.out.println(" Company " + BallPointer.Company + " Price " +BallPointer.Price + " Type " +BallPointer.Type);


Pen InkPen= new Pen();
	InkPen.Company="Parker";
	InkPen.Price= 5000;
    InkPen.Type= "Black";
	System.out.println(" Company " + InkPen.Company + " Price " +InkPen.Price + " Type " +InkPen.Type);
	
	Pen GelPen= new Pen();
	GelPen.Company="Piano";
	GelPen.Price= 350;
    GelPen.Type= "Green";
	System.out.println(" Company " + GelPen.Company + " Price " +GelPen.Price + " Type " +GelPen.Type);
	
}}