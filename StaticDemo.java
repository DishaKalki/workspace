class StaticDemo{
	public static int a=0;
	private int b;
	public void set(int i,int j)
	{
		a=i;
		b=j;
	}
	public void show()
	{
		System.out.println("static a "+a);
		System.out.println("b="+b);
	}
	public static void main(String[] args)
	{
		StaticDemo x= new StaticDemo();
		StaticDemo y= new StaticDemo();
		x.set(1, 1);
		x.show();
		y.set(2, 2);
		y.show();
		x.show();
		
		
	}
}
