
public class PopulacaoMundial {

	public static void main(String[] args) {
		System.out.println(args[0]);
		Long populacao = 7000000000L;
		Integer anos = Integer.valueOf(args[0]);
		Double taxa = 0.012;

		Double total = populacao.doubleValue();
		for (int i = 0; i < anos; i++) {
			total = total + (total * taxa);
		}
		System.out.println(Math.round(total) + "  pessoas");
	}
}
