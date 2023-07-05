package practisemock;

public class ConcreteCLASS extends Abclass {

	public static void main(String[] args) {
		ConcreteCLASS co=new ConcreteCLASS();
		co.life();
		co.dreams();
		co.believe();
		co.reality();
		


	}

	@Override
	public void life() {
		System.out.println("life is GOOD:BE positive");
		
	}

	@Override
	public void dreams() {
		
		System.out.println("mY EVERY DREMS will come TRue");
		
	}

	@Override
	public void reality() {
		System.out.println("reality is diff from dreams but one who never giveup will WIN the Life RACE");
		
	}
	

}
