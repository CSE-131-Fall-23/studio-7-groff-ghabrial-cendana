package studio7;

public class Die {
	
	private int sides;
	
	public Die(int sides) {
		this.sides = sides;
	}
	
	public int randomRoll() {
		return (int)(Math.random()*sides+1);
	}

	public static void main(String[] args) {
		Die die5 = new Die(5);
		System.out.println(die5.randomRoll());
	}

}
