package superkeyword;

public class SuperExample1 extends SuperExample{

	public void example1()
	{
		super.example(10,20);
		System.out.println(super.sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperExample1 obj=new SuperExample1();
				obj.example1();
	}

}
