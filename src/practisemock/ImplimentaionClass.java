package practisemock;

public class ImplimentaionClass implements Interface{

	public static void main(String[] args) {
		ImplimentaionClass imp=new ImplimentaionClass();
		imp.fun();
		imp.friendship();

	}

	@Override
	public void fun() {
		
		System.out.println("life khelti bhi usi ke sath he jo khiladi kamal ke hote he ");
		System.out.println("toh agr life agr khel rahi he toh khelo yaar");
		System.out.println("have FUNN");
	}

	@Override
	public void friendship() {
		System.out.println("TRUE FRIENDS really change a life vibe");
		
		
	}

}
