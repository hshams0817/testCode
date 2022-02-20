package org.javaPackage;

public class Addition {
	static int a =5;
	
	
	void add()
{
	int a=5;
	int b=10;
	int c=a+b;
	System.out.println(c);
}

int product()
{
	int a=5;
	int b=10;
	int c= a*b;
	return c;
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int a=5;
//int b=10;
//int c=(a+b);
//System.out.println("The sum of two numbers "+c);
Addition obj=new Addition();
obj.add();
System.out.println(obj.product());
System.out.println(a);


	}

}
