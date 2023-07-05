package practisemock;

public class Inheritance2 extends Inheritance {

	public static void main(String[] args) {
		Inheritance2 i=new Inheritance2();
		i.ssc();
		i.dilpoma();
		i.BE();

	}
	public void BE()
	{
		String degree="E&tc";
		int marks=75;
		char grade='A';
		System.out.println("BE RESULT" +degree);
		System.out.println(marks);
		System.out.println(grade);
	}

}
