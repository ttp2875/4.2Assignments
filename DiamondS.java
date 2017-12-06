public class DiamondS {
	public static void main(String[] args) {
		int i=1;
		while(i<26) {
			switch(i) {
				case 3: case 7: case 8: case 9: case 11: case 12: case 13: case 14: case 15: case 17: case 18: case 19: case 23:
				System.out.print("*");
				break;
		default:
				System.out.print(" ");
			}
			if(i%5==0){
				System.out.println();
			}
			i++;
		}
	}
}
