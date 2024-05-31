package mavenproject;

public class HiInheriB extends HiInheri{

	public void display()
	{
		System.out.println("Child B");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HiInheriB obj= new HiInheriB();
		obj.display();
		obj.sample();
	}

}
