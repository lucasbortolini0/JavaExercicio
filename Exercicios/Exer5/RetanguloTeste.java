public class RetanguloTeste{
    public static void main(String[] args){
        Retangulo retangulo = new Retangulo(Double.valueOf(args[0]), Double.valueOf(args[1]));

        Double comprimento = Double.valueOf(args[0]);
        Double largura = Double.valueOf(args[1]);

        retangulo.getLargura();
        retangulo.getComprimento();
        retangulo.area();
        retangulo.perimetro();
    }
}