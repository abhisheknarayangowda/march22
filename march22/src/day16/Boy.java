package day16;
abstract class Aa
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
		System.out.println("Hai");
}
	abstract void a2();
}
public class Boy extends Aa
{
	void a2()
	{
		System.out.println("Hello");
	}
}
 class Abss
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Boy obj = new Boy();
		obj.a1();
		obj.a2();
		obj.setD(11);
		System.out.println(obj.getD());
			}

		
	}


