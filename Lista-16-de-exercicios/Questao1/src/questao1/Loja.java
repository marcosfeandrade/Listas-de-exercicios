package questao1;

import java.util.Scanner;

public class Loja {

    private Produto produtos[];
    private int quantidadeProdutosCadastrado;

    public Loja(int quantidadeProdutosTotal) {
        this.produtos = new Produto[quantidadeProdutosTotal];
        this.quantidadeProdutosCadastrado = 0;
    }

    public void cadastrarProduto(Produto produto) {
        if (existeProduto(produto)) {
            System.out.println("Produto já cadastrado");
        } else {
            produtos[quantidadeProdutosCadastrado] = produto;
            this.quantidadeProdutosCadastrado++;
        }
    }

    public boolean existeProduto(Produto produto) {
        int i;
        for (i = 0; i < this.quantidadeProdutosCadastrado; i++) {
            if (produto.compareTo(this.produtos[i]) == 0) {
                return true;
            }
        }
        return false;
    }

    public void exibeProdutos() {
        for (int i = 0; i < quantidadeProdutosCadastrado; i++) {
            System.out.println(this.produtos[i]);
        }
    }

    public void alterarPrecoProduto(double percetual, String codigo, char entrada) {
        Produto p = recuperarProduto(codigo);
        if (p == null) {
            System.out.println("Produto não existente!");
        } else {
            if (entrada == 1) {
                p.aplicarAumento(percetual);
            } else {
                p.aplicarDesconto(percetual);
            }
        }
    }

    public void acrescentarEstoqueProduto(int quantidadeEstoque, String codigo) {
        Produto p = recuperarProduto(codigo);
        if (p == null) {
            System.out.println("Produto não existente!");
        } else {
            p.atualizarEstoque(quantidadeEstoque);
        }
    }
    
    public void venda(int quantidadeComprada, String codigo){
        Produto p = recuperarProduto(codigo);
        if (p == null) {
            System.out.println("Produto não existente!");
        } else {
            p.venderProduto(quantidadeComprada);
        }
    }

    public Produto recuperarProduto(String codigo) {
        for (int i = 0; i <= quantidadeProdutosCadastrado; i++) {
            if (codigo.equals(this.produtos[i].getCodigo())) {
                return produtos[i];
            }
        }
        return null;
    }
    
    public void imprimeProduto(){
        for (int i = 0; i <= quantidadeProdutosCadastrado; i++) {
            System.out.println(produtos[i]);
        }
    }
}
