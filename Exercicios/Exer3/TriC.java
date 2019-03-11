public class TriC {

    public TriC(int numero) {

        for (Integer i = 0; i < numero; i++) {

            for (Integer j = 1; j <= i + 1; j++) {
                System.out.print("");
            }
            for (Integer x = numero; x >= i + 1; x--) {

                System.out.print("*");
            }

            System.out.println();
        }

    }

}
