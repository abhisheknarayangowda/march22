package ad;
abstract class BaseClass
{
	abstract public void show1();
	public void show2()
	{
		System.out.println(" conncrete method of parent class");
	}
}
class childClass extends BaseClass
{
	public void show1()
	{
		System.out.println("overriding the abstract method of the parent class");
	}
	public void show2()
	{
		System.out.println("overriding concrete method of the parent class");
	}
}
public class AbstractionDemoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
childClass obj = new childClass();
obj.show1();
obj.show2();
	}

}
