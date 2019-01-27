import java.util.*;
class complex
{
int r;
int i;
complex(){}//non parameterised
complex(int r,int i)
{
	this.r =r;
	this.i=i;
}

/*complex add (complex c)
{
	complex cadd=new complex();
	cadd.r=r+c.r;
	cadd.i=i+c.i;
	return cadd;
}*/

}

class ComplexDemoStatic
{
	 public static void main(String[] args) 
	 {
		

	complex c1=new complex(1,2);
	complex c2=new complex(3,4);
	complex c3=new complex();
	c3=add(c1,c2);
	System.out.println("c1="+c1.r+" "+c1.i);
	System.out.println("c2="+c2.r+" "+c2.i);
	System.out.println("Sum="+c3.r+" "+c3.i);

} 

public static complex add(complex c1,complex c2)
{
	complex c3=new complex();
	c3.r=c1.r+c2.r;
	c3.i=c1.i+c2.i;
	return c3;
}

}





