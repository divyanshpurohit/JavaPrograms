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

complex add (complex c)
{
	complex cadd=new complex();
	cadd.r=r+c.r;
	cadd.i=i+c.i;
	return cadd;
}

}

class ComplexDemo
{
	 public static void main(String[] args) 
	 {
		

	complex c1=new complex(1,2);
	complex c2=new complex(3,4);
	complex c3=new complex();
	c3=c1.add(c2);
	System.out.println("c1="+c1.r+" "+c1.i);
	System.out.println("c2="+c2.r+" "+c2.i);
	System.out.println("Sum="+c3.r+" "+c3.i);

} 
}



