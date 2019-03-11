public class TriA {

	public TriA(int numero) {

		for (Integer i = 0; i < numero; i++) {
			
			for (Integer j = 1; j <= i+1; j++) {
				System.out.print("*");
			}
			System.out.println("");
			
		}
		
	}
}