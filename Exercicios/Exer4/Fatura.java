
public class Fatura {

    public String codigo;
    public String descricao;
    private Integer qts_comprada;
    private Double preco;

    public Fatura(String codigo, String descricao, String qts_comprada, String preco) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.qts_comprada = Integer.valueOf(qts_comprada);
        this.preco = Double.valueOf(preco);

    }

    public void totalFaturado() {
        System.out.println("Descrição produto:" + descricao);
        System.out.println("Valor da fatura:" + (preco * qts_comprada));
    }

}
