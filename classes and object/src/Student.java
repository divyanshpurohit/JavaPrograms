import java.util.*;   

class Student
{
String firstname;
String lastname;
Address addr;

public Student (String firstname ,String lastname )
{
	this.firstname=firstname;
	this.lastname=lastname;
	

}

public Student (String firstname ,String lastname ,Address addr)
{
	this.firstname=firstname;
	this.lastname=lastname;
	this.addr=addr;

}
public void display()
	{
		System.out.println("Student Details");
        System.out.println("Name::"+firstname+" "+lastname);
        System.out.print("Address::");
        addr.display();
        
	}

}



