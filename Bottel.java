class Bottel{

String Company;
int RealseYear;
String Color ;


public static void main(String[]args){
	Bottel SoftDrink= new Bottel();
	SoftDrink.Company="Coca Cola";
	SoftDrink.RealseYear= 1892;
    SoftDrink.Color= "Black";
	System.out.println(" Company " + SoftDrink.Company + " RealseYear " +SoftDrink.RealseYear + " Color " +SoftDrink.Color);

Bottel SoftDrink2= new Bottel();
	SoftDrink2.Company="Red Bull";
	SoftDrink2.RealseYear= 1987;
    SoftDrink2.Color= "Yellow";
	System.out.println(" Company " + SoftDrink2.Company + " RealseYear " +SoftDrink2.RealseYear + " Color " +SoftDrink2.Color);
	
	Bottel SoftDrink3= new Bottel();
	SoftDrink3.Company="Pepsi";
	SoftDrink3.RealseYear= 1893 ;
    SoftDrink3.Color= "black";
	System.out.println(" Company " + SoftDrink3.Company + " RealseYear " +SoftDrink3.RealseYear + " Color " +SoftDrink3.Color);

}}