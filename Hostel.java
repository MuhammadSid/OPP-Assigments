class Hostel{

String name;
int rooms;
int floors;


public static void main(String[]args){
	Hostel latif= new Hostel ();
	latif.name="boys hostel";
	latif.rooms= 10;
      latif.floors= 2;
	System.out.println(" Name " + latif.name + " Rooms " +latif.rooms + " Floors " +latif.floors);
	
	Hostel Marvi= new Hostel ();
	Marvi.name="Girls hostel";
	Marvi.rooms= 25;
      Marvi.floors= 5;
	System.out.println(" Name " + Marvi.name + " Rooms " +Marvi.rooms + " Floors " +Marvi.floors);
	
	Hostel Faculty= new Hostel ();
	Faculty.name="Employess hostel";
	Faculty.rooms= 5;
      Faculty.floors= 1;
	System.out.println(" Name " + Faculty.name + " Rooms " +Faculty.rooms + " Floors " +Faculty.floors);
	
}}