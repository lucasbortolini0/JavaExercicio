public class Circulo implements AreaCalcula {
    private Double diametro;
    public Circulo( Double diametro ) {
        this.diametro = diametro;
    }  
    @Override
    public Double calcularArea( ) {
        Double resultadoCirculo;
       resultadoCirculo = Math.PI * ( diametro/2 );
        return resultadoCirculo;
    }
    public Double getDiametro() {
		return this.diametro;
	}
	public void setDiametro( Double diametro ) {
		this.diametro = diametro;
	}
}