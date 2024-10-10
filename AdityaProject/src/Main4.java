interface Stock {
	public static final double price = 140;

	abstract void buy(double quantity);

	abstract void sell(double quantity);
	
	abstract double getVolume();
}

class Solana implements Stock {
	double volume = 10000;

	@Override
	public void buy(double quantity) {
		// TODO Auto-generated method stub
		volume -= price * quantity;
	}

	@Override
	public void sell(double quantity) {
		// TODO Auto-generated method stub
		volume += price * quantity;
	}

	@Override
	public double getVolume() {
		// TODO Auto-generated method stub
		return volume;
	}

}

public class Main4 {
	public static void main(String[] args) {
		Solana s = new Solana();
		System.out.println(s.getVolume());
		s.buy(10);
		s.sell(3);
		System.out.println(s.getVolume());
	}
}
