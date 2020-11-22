//CLASSE PRODUTO
package questao1;

public class Produto implements Comparable<Produto> {

    private String codigo, descricao, fornecedor;
    private double preco;
    private int qtd;

    public Produto(String codigo, String descricao, String fornecedor,
            double preco, int qtd) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.fornecedor = fornecedor;
        this.preco = preco;
        this.qtd = qtd;
    }

    private void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    private String getCodigo() {
        return this.codigo;
    }

    private void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    private String getDescricao() {
        return this.descricao;
    }

    private void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    private String getFornecedor() {
        return this.fornecedor;
    }

    private void setPreco(double preco) {
        this.preco = preco;
    }

    private double getPreco() {
        return this.preco;
    }

    private void setQuantidade(int qtd) {
        this.qtd = qtd;
    }

    private int getQuantidade() {
        return this.qtd;
    }

    public void aplicarDesconto(double perc) {
        double desc = this.preco - (this.preco * (perc / 100));
        this.setPreco(desc);
    }

    public void aplicarAumento(double perc) {
        double desc = this.preco + (this.preco * (perc / 100));
        this.setPreco(desc);
    }

    public void atualizarEstoque(int quant) {
        int estoque = this.qtd + quant;
        this.setQuantidade(estoque);
    }

    public void venderProduto(int quant) {
        int estoque = this.qtd - quant;
        this.setQuantidade(estoque);
    }

    public String toString() {
        return "Código: " + this.getCodigo() + "; Descrição: " + this.getDescricao() 
                + "; Fornecedor: " + this.getFornecedor() + "; Preço: " 
                + this.getPreco() + "; Estoque: " + this.getQuantidade();
    }

    public int compareTo(Produto qtd2) {
        int resultado;
        resultado = this.getQuantidade()- qtd2.getQuantidade();
        return resultado;
    }
}
