package day16;
abstract class A
{
	static int c;
	final int i = 10;
	private int d;
	public int getD()
	{
		return d;
	}
	public void setD(int d)
	{
		this.d = d;
	}
	void a1()
	{
		System.out.println("Sri Ramakrishna");
}
	abstract void a2();
}

public class B extends A
{
	void a2()
	{
		System.out.println("Sri Sharada Devi");
	}
}
 class Abs
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
B obj = new B();
obj.a1();
obj.a2();
obj.setD(11);
System.out.println(obj.getD());
	}

}
