class Internet{

String Company;
int RealseYear;
String Engine ;


public static void main(String[]args){
	Internet Website= new Internet();
	Website.Company="Google Chrome";
	Website.RealseYear= 2008;
     Website.Engine= "webkit";
	System.out.println(" Company " + Website.Company + " RealseYear " +Website.RealseYear + " Engine " +Website.Engine);

Internet Website2= new Internet();
	Website2.Company="Mozila Firefox";
	Website2.RealseYear= 2002;
     Website2.Engine= "Quantium";
	System.out.println(" Company " + Website2.Company + " RealseYear " +Website2.RealseYear + " Engine " +Website2.Engine);
	
	Internet Website3= new Internet();
	Website3.Company="Opera";
	Website3.RealseYear= 1995;
     Website3.Engine= "Blink";
	System.out.println(" Company " + Website3.Company + " RealseYear " +Website3.RealseYear + " Engine " +Website3.Engine);

}}