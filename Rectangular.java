public class Rectangular{

	private int length;
	private int height;

	public Rectangular(int length, int height){
		this.length = length;
		this.height = height;
	}

		//makes full line of asterisks
	public void fullLine(){
		for(int i = 0; i<length;i++){
		System.out.print("* ");
		}
		System.out.println(" ");
	}
	//creates only two asterisks. one on each border
	public void borderLine(){
		System.out.print("* ");
		for(int i = 0; i < length + 41; i++){
			System.out.print(" ");
		}
		System.out.print("*");
		System.out.println(" ");
	}

	public void makeRectangle(){
		fullLine();
		for(int i = 0; i < height - 2; i++){
			borderLine();
		}
		fullLine();

	}

}