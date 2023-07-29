package stude;

public class Firstapproach {

int a,b,c,d;



public Firstapproach(int a,int b,int c) 
{
	
	
		System.out.println("three parameterized constructor");

}

public  Firstapproach(int a,int b,int c,int d) 
{
	this(10,20);

		System.out.println("four parameterized constructor");

}

public  Firstapproach(int a,int b) 
{
	this();
		
	System.out.println("two parameterized constructor");

}

public  Firstapproach(int a) 
{
	this(10,20,30,40);

		System.out.println("One parametrized constructor");

}
	
public  Firstapproach() 
{
	this(10,20,30);

		System.out.println("Default parametrized constructor");

}
	
	public static void main(String[] args) {
		
		Firstapproach del=new Firstapproach(20);
		
	
		
}

}
