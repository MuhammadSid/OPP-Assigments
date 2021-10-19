class Fan{

String Company;
int Price;
String Color ;


public static void main(String[]args){
	Fan Celling= new Fan();
	Celling.Company="Royal";
	Celling.Price= 3000;
    Celling.Color= "White";
	System.out.println(" Company " + Celling.Company + " Price " +Celling.Price + " Color " +Celling.Color);


	Fan Pedistal= new Fan();
	Pedistal.Company="Deluxe";
	Pedistal.Price= 2500;
    Pedistal.Color= "Black";
	System.out.println(" Company " + Pedistal.Company + " Price " +Pedistal.Price + " Color " +Pedistal.Color);

	Fan Mist= new Fan();
	Mist.Company="GFC";
	Mist.Price= 6000;
    Mist.Color= "Black";
	System.out.println(" Company " + Mist.Company + " Price " +Mist.Price + " Color " +Mist.Color);
}}