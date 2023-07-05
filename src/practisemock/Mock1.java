package practisemock;

public class Mock1 {
	int a;
	int b;
	int sum;

	public static void main(String[] args) 
	{
		Mock1 m=new Mock1();
		m.addition();
	}
	public  void addition()
	{
	 sum=a+b;
	 System.out.println("student marks"+sum);
	}
	public  Mock1()
	{
		a=20;
		b=30;
		
	}

}
