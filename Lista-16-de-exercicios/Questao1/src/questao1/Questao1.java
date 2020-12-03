//Marcos Fellipe Andrade da Silva
package questao1;

import java.util.Scanner;

public class Questao1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char resp;
        double preco;
        int qtt, quant;
        String cod, desc, forn, codigoParametro;
        System.out.println("Quantidade de produtos: ");
        quant = in.nextInt();
        Loja loja = new Loja(quant);
        do {
            System.out.println("Opções: ");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Exibir os dados de todos os produtos");
            System.out.println("3 - Alterar preço");
            System.out.println("4 - Atualizar estoque");
            System.out.println("5 - Realizar venda");
            System.out.println("6 - Nenhuma.");
            resp = in.next().charAt(0);
            if (resp == '1') {
                in.nextLine();
                System.out.println("Código: ");
                cod = in.nextLine();
                System.out.println("Descrição: ");
                desc = in.nextLine();
                System.out.println("Fornecedor: ");
                forn = in.nextLine();
                System.out.println("Preço: ");
                preco = in.nextDouble();
                System.out.println("Quantidade em estoque: ");
                qtt = in.nextInt();
                loja.cadastrarProduto(new Produto(cod, desc, forn, preco, qtt));
            } else if (resp == '2'){
                loja.exibeProdutos();
            }
                else if (resp == '3') {
                System.out.println("Codigo do produto: ");
                codigoParametro = in.nextLine();
                System.out.println("Percentual: ");
                int perc = in.nextInt();
                System.out.println("Escolha: ");
                System.out.println("1 - Aumento percentual");
                System.out.println("2 - Desconto.");
                char resp2 = in.next().charAt(0);
                while (resp2 != '1' && resp2 != '2') {
                    System.out.println("Opção inválida. Insira novamente.");
                    resp2 = in.next().charAt(0);
                }
                loja.alterarPrecoProduto(perc, codigoParametro, resp2);
            } else if (resp == '4') {
                System.out.println("Codigo do produto: ");
                codigoParametro = in.nextLine();
                System.out.println("Quantidade: ");
                int quantidadeAcrescenta = in.nextInt();
                loja.acrescentarEstoqueProduto(quantidadeAcrescenta, codigoParametro);
            } else if (resp == '5') {
                System.out.println("Codigo do produto: ");
                codigoParametro = in.nextLine();
                System.out.println("Quantidade: ");
                int quantidadeComprada = in.nextInt();
                loja.acrescentarEstoqueProduto(quantidadeComprada, codigoParametro);
            }
        } while (resp != '6');
    }
}
