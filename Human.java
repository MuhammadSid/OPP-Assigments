class Human{

String Tribe;
String Country;
String Language ;


public static void main(String[]args){
	Human Asian= new Human();
	Asian.Tribe="Hindu";
	Asian.Country= "India";
     Asian.Language= "Hindi";
	System.out.println(" Tribe " + Asian.Tribe + " Country " +Asian.Country + " Language " +Asian.Language);
	
Human American= new Human();
	American.Tribe="Native";
	American.Country= "Usa";
      American.Language= "English";
	System.out.println(" Tribe " + American.Tribe + " Country " +American.Country + " Language " +American.Language);
	
	Human African= new Human();
	African.Tribe="Zulu";
	African.Country= "South Africa";
      African.Language= "Zulu";
	System.out.println(" Tribe " + African.Tribe + " Country " +African.Country + " Language " +African.Language);
	
}}