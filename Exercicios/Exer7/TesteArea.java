import java.util.Arrays;
import java.util.List;

public class TesteArea {
    public static void main(String[] args) {
    	List<AreaCalcula> objetos = Arrays.asList(
    		new Circulo(14.5),
            new Quadrado(30.0),
            new Retangulo(18.0,1.0)
        );
        objetos.forEach(objeto -> System.out.println( objeto.calcularArea()));
    }
}