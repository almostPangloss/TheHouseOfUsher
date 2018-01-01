package textBook;


public class forMultiplying {

	public static void main(String[] args) {
		
		int total = 0;

		for (int i = 33; i < 98; i++){
			if ( i % 7 == 0){
				total++;
			}
		}
		
		System.err.println(total);
	}

}
