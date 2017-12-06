public class OneEvenNWhile {
	public static void main(String[] args) {
		int i = 1;
		System.out.println("First one hundred even numbers are" );
		while ( i <= 202 ) {
			i = i + 1;
			if (i % 2 == 0 ){
				System.out.print(" " +i);
				i++;
			}
		}
	}
}
