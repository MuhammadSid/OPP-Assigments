class Book{

String name;
int noOfPages;
int noOfChapters;


public static void main(String[]args){
	Book Physics= new Book ();
	Physics.noOfPages=100;
	Physics.name= "Intro To Physics";
      Physics.noOfChapters=10;
	System.out.println(Physics.name);
	System.out.println(Physics.noOfPages);
	System.out.println(Physics.noOfChapters);
	
	Book Ps= new Book();
	Ps.noOfPages=11;
	Ps.name= "Intro To Ps";
    Ps.noOfChapters=11;
	System.out.println("Name of Book is " + Ps.name);
	System.out.println(Ps.noOfPages);
	System.out.println(Ps.noOfChapters);
	
		Book Math= new Book();
	Math.noOfPages=300;
	Math.name= "Mathematics";
    Math.noOfChapters=20;
	System.out.println("Name of Book is " + Math.name);
	System.out.println(Math.noOfPages);
	System.out.println(Math.noOfChapters);
}}