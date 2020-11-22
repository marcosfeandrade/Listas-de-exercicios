//Marcos Fellipe Andrade da Silva
package questao1;

import java.util.Scanner;

public class Questao1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char resp;
        double perc, preco;
        int att, qtt, quant, resp2, i = 0;
        String cod, desc, forn;
        System.out.println("Quantidade de objetos: ");
        quant = in.nextInt();
        in.nextLine();
        Produto prod[] = new Produto[quant];
        for (i = 0; i < quant; i++) {
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
            prod[i] = new Produto(cod, desc, forn, preco, qtt);
            in.nextLine();
        }
            do {
                System.out.println("Deseja realizar alguma opção: ");
                System.out.println("1 - Dar desconto no produto");
                System.out.println("2 - Percentual de aumento de preço");
                System.out.println("3 - Atualizar estoque");
                System.out.println("4 - Retirar do estoque");
                System.out.println("5 - Exibir informações");
                System.out.println("6 - Comparar quantidade de 2 produtos");
                System.out.println("7 - Não.");
                resp = in.next().charAt(0);
                if (resp == '1') {
                    System.out.println("Escolha o produto que deseja editar");
                    resp2 = in.nextInt();
                    while(resp2 < 0 || resp2 > i){
                        System.out.println("Produto invalido. Digite novamente");
                        resp2 = in.nextInt();
                    }
                    System.out.println("Percentual de desconto: ");
                    perc = in.nextDouble();
                    prod[resp2].aplicarDesconto(perc);
                } else if (resp == '2') {
                    System.out.println("Escolha o produto que deseja editar");
                    resp2 = in.nextInt();
                    while(resp2 < 0 || resp2 > i){
                        System.out.println("Produto invalido. Digite novamente");
                        resp2 = in.nextInt();
                    }
                    System.out.println("Percentual de aumento de preço: ");
                    perc = in.nextDouble();
                    prod[resp2].aplicarAumento(perc);
                } else if (resp == '3') {
                    System.out.println("Escolha o produto que deseja editar");
                    resp2 = in.nextInt();
                    while(resp2 < 0 || resp2 > i){
                        System.out.println("Produto invalido. Digite novamente");
                        resp2 = in.nextInt();
                    }
                    System.out.println("Atualização de estoque: ");
                    att = in.nextInt();
                    prod[resp2].atualizarEstoque(att);
                } else if (resp == '4') {
                    System.out.println("Escolha o produto que deseja editar");
                    resp2 = in.nextInt();
                    while(resp2 < 0 || resp2 > i){
                        System.out.println("Produto invalido. Digite novamente");
                        resp2 = in.nextInt();
                    }
                    System.out.println("Quantidade de produto vendido: ");
                    att = in.nextInt();
                    prod[resp2].venderProduto(att);
                } else if(resp == '5') {
                    System.out.println("Escolha o produto que deseja exibir");
                    resp2 = in.nextInt();
                    while(resp2 < 0 || resp2 > i){
                        System.out.println("Produto invalido. Digite novamente");
                        resp2 = in.nextInt();;
                    }
                    System.out.println(prod[resp2]);
                }
                else{
                    System.out.println("Digite o numero de um produto:");
                    int p1 = in.nextInt();
                    System.out.println("Digite o numero de outro produto: ");
                    int p2 = in.nextInt();
                    if(prod[p1].compareTo(prod[p2]) == 0){
                        System.out.println("Os produtos tem a mesma quantidade");
                    } else{
                        System.out.println("Os produtos tem quantidades diferentes");
                    }
                }
            } while (resp != '7');
        
    }

}
