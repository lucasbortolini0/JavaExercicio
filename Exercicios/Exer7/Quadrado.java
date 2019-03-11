public class Quadrado implements AreaCalcula{
    private Double lado;
    public Quadrado( Double lado ) {
        this.lado = lado;
    }   
    @Override
    public Double calcularArea( ) {
        double resultadoQuadrado;
       resultadoQuadrado = Math.pow(lado,2);
        return resultadoQuadrado;
    }
  
    public Double getLado() {
		return this.lado;
	}
	public void setLado( Double lado ) {
		this.lado = lado;
	}
}