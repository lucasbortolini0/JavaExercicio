public class Retangulo{
    private Double comprimento = 1.0;
    private Double largura = 1.0;
    private Double area;
    private Double perimetro;

    public Retangulo(Double comprimento, Double largura) {
        this.comprimento.valueOf(comprimento);
        this.largura = Double.valueOf(largura);
    }

    public Double getComprimento() {
        return this.comprimento;
    }

    public void setComprimento(Double comprimento) {
        if(comprimento > 0.0 ){
            this.comprimento = comprimento;
        }else{
            System.out.println("Um dos lados do retangulo é igula ou menos que zero");
        System.exit(0);
        }
    }

    public Double getLargura() {
        return this.largura;
    }

    public void setLargura(Double largura) {
        if(largura > 0.0 ){
            this.largura = largura;
        }else{
            System.out.println("Um dos lados do retangulo é igula ou menos que zero");
        System.exit(0);
        }
    }
    
    public void area(){
        area = comprimento*largura;
        System.out.println("A area: "+ area);
    }
    public void perimetro(){
        perimetro = largura+largura+comprimento+comprimento;
        System.out.println("A perimetro: "+ perimetro);
    }



}