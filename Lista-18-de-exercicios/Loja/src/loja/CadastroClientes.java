package loja;

import java.util.Scanner;

public class CadastroClientes {

    private Cliente[] cliente;
    private int qtd;
    private boolean ordenado;

    public CadastroClientes() {
        cliente = new Cliente[2000];
    }

    public void cadastraCliente(Cliente c) {
        if (comparaCPF(c) == 1) {
            cliente[qtd] = c;
            qtd++;
            ordenado = false;
        } else {
            System.out.println("CPF já cadastrado.");
        }
    }

    public int comparaCPF(Cliente c) {
        if (qtd == 0) {
            return 1;
        }
        for (int i = 0; i < qtd; i++) {
            if (cliente[i].compareTo(c) == 0) {
                return 0;
            }
        }
        return 1;
    }

    public void bubbleSort() {
        Cliente c;
        int i, fim, pos;
        boolean troca;
        fim = qtd - 1;
        pos = 0;
        do {
            troca = false;
            for (i = 0; i < fim; i++) {
                if (cliente[i].compareTo(cliente[i + 1]) > 0) {
                    c = cliente[i];
                    cliente[i] = cliente[i + 1];
                    cliente[i + 1] = c;
                    pos = i;
                    troca = true;
                }
            }
            fim = pos - 1;
        } while (troca == true);
        ordenado = true;
    }

    private int buscaNoCadastro(String c) {
        int retorno;
        if (ordenado) {
            retorno = buscaBinaria(c);
            return retorno;
        } else {
            retorno = buscaSimples(c);
            return retorno;
        }
    }

    public int buscaSimples(String c) {
        Cliente clienteBuscado = new Cliente(c, "");
        if (qtd == 0) {
            return -1;
        }
        for (int i = 0; i < qtd; i++) {
            if (clienteBuscado.compareTo(cliente[i]) == 0) {
                return i;
            }
        }
        return -1;
    }

    public int buscaBinaria(String c) {
        Cliente clienteBuscado = new Cliente(c, "");
        int inicio = 0;
        int fim = qtd - 1;
        int meio;
        if (this.qtd == 0) {
            return -1;
        } else {
            do {
                meio = (inicio + fim) / 2;
                if (clienteBuscado.compareTo(cliente[meio]) == 0) {
                    return meio;
                } else if (clienteBuscado.compareTo(cliente[meio]) < 0) {
                    fim = meio - 1;
                } else {
                    inicio = meio + 1;
                }
            } while (inicio <= fim);
            return -1;
        }
    }

    public void consultaDados(String c) {
        int retorno = buscaNoCadastro(c);
        if (retorno == -1) {
            System.out.println("Cliente não encontrado");
        } else {
            System.out.println(cliente[retorno]);
        }
    }

    public void alteraDados(String c) {
        Scanner in = new Scanner(System.in);
        int retorno = buscaNoCadastro(c);
        if (retorno == -1) {
            System.out.println("Cliente não encontrado");
        } else {
            System.out.println("1 - Alterar email");
            System.out.println("2 - Alterar fone");
            System.out.println("3 - Alterar email e fone");
            char resp = in.next().charAt(0);
            while (resp < '1' || resp > '3') {
                System.out.println("Resposta inválida.");
                System.out.println("1 - Alterar email");
                System.out.println("2 - Alterar fone");
                System.out.println("3 - Alterar email e fone");
                resp = in.next().charAt(0);
            }
            in.nextLine();
            if (resp == '1') {
                System.out.println("Novo email: ");
                String emailNovo = in.nextLine();
                cliente[retorno].alteraEmail(emailNovo);
            } else if (resp == '2') {
                System.out.println("Novo fone: ");
                String foneNovo = in.nextLine();
                cliente[retorno].alteraFone(foneNovo);
            } else {
                System.out.println("Novo email: ");
                String emailNovo = in.nextLine();
                cliente[retorno].alteraEmail(emailNovo);
                System.out.println("Novo fone: ");
                String foneNovo = in.nextLine();
                cliente[retorno].alteraFone(foneNovo);
            }
        }
    }

    public void removeCliente(String c) {
        int retorno = buscaNoCadastro(c);
        if (retorno == -1) {
            System.out.println("Cliente não encontrado");
        } else {
            remove(c);
        }
    }

    public void remove(String c) {
        int aux;
        int i;
        aux = buscaBinaria(c);
        for (i = aux; i < qtd; i++) {
            cliente[i] = cliente[i + 1];
        }
        --qtd;
        System.out.println("Cliente removido.");
    }

    public void exibeTodosDados() {
        for (int i = 0; i < qtd; i++) {
            System.out.println(cliente[i]);
        }
    }
}
