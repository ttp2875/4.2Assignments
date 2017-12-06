public class OneOddNFor {
	public static void main(String[] args) {
		int limit= 201;
		System.out.println("First one hundred odd numbers are" );
		for(int i=1; i<= limit; i++) {
			if (i % 2 != 0){
				System.out.print(i + " ");
			}
		}
	}
}
