package mavenproject;

public class HiInheriC extends HiInheri{

	public void display1()
	{
		System.out.println("Child C");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HiInheriC obj= new HiInheriC();
		obj.display1();
		obj.sample();
	}

}
