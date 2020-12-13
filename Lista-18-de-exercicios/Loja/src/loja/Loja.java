package loja;

import java.util.Scanner;

public class Loja {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        CadastroClientes c = new CadastroClientes();
        char resp = 1;
        String cpf, nome;
        do{
        System.out.println("Opções\n"
                + "1 – Cadastrar um cliente\n"
                + "2 – Ordenar crescente por CPF\n"
                + "3 – Consultar um cliente\n"
                + "4 – Alterar os dados de um cliente\n"
                + "5 – Remover um cliente\n"
                + "6 - Exibe dados de todos os clientes\n"
                + "0 – Sair do programa\n"
                + "Informe a opção:");
        resp = in.next().charAt(0);
        in.nextLine();
            switch (resp) {
                case '1':
                    System.out.println("CPF do cliente: ");
                    cpf = in.nextLine();
                    System.out.println("Nome do cliente: ");
                    nome = in.nextLine();
                    Cliente cliente = new Cliente (cpf, nome);
                    c.cadastraCliente(cliente);
                    break;
                case '2':
                    c.bubbleSort();
                    break;
                case '3':
                    System.out.println("CPF do cliente: ");
                    cpf = in.nextLine();
                    c.consultaDados(cpf);
                    break;
                case '4':
                    System.out.println("CPF do cliente: ");
                    cpf = in.nextLine();
                    c.alteraDados(cpf);
                    break;
                case '5':
                    System.out.println("CPF do cliente: ");
                    cpf = in.nextLine();
                    c.removeCliente(cpf);
                    break;
                case '6':
                    c.exibeTodosDados();
                    break;
                default:
                    System.out.println("Encerrando o programa...");
                    break;
            }
        }while (resp != '0');
    }

}
