package day;
abstract class ParentClass
{
	abstract public void showDetails();
	}
class childClass extends ParentClass
{
	public void showDetails()
	{
		System.out.println("overriding abstract method");
	}
}
public class AbstractionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ParentClass obj = new ParentClass();  //Error : We can't create object of an abstract
obj.showDetails();
obj.showDetails();
	}

}
