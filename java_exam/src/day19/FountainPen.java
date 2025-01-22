package day19;

public class FountainPen {
	private int amount; // 남은 량


	public void setAmount(int amount) {
		this.amount = amount;
	}


	public void refill(int n) {
		setAmount(n);
	}

}
