package studio7;

public class Die {
	private int n;
	
	public static void main(String[] args) {
		Die R= new Die(10);
		System.out.println(R.randomSide());
	}
	
	public Die(int number) {
		n= number;
	}
	public int randomSide() {
		int side= (int)(Math.random()* (n-1)+ 1);
		return side;
	}
}
