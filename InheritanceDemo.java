class A
{
	int m,n;
	void display1()
	{
		System.out.println("M=" +m + "N="+n);
	}
}
class B extends A
{
	int c;
	void display2()
	{
		System.out.println("C"+c);
	}
	void sum()
	{
		System.out.println("Sum ="+(m+n+c));
	}
}




public class InheritanceDemo {
     public static void main(String[] args)
     {
    	 A s1=new A();
    	 B s2=new B();
    	 s1.m=10;s1.n=20;
    	 s1.display1();
    	 //s2.m=7;s2.n=8;
    	 s2.c=5;
    	 //s2.display1();
    	 s2.display2();
    	 s2.sum();
     }
}
