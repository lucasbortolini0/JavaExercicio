public class Retangulo implements AreaCalcula {
    private Double base;
    private Double altura;

    public Retangulo( Double base, Double altura ) {
        this.base   = base;
        this.altura = altura;
    }
    @Override
    public Double calcularArea( ) {
        Double resultadoRetangulo;
      resultadoRetangulo = base * altura;
        return resultadoRetangulo;        
    }
}