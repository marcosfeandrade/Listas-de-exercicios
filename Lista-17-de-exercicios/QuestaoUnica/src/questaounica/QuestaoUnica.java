package questaounica;

import java.util.Scanner;

public class QuestaoUnica {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Cadastro cadastro = new Cadastro();
        char resp;
        do {
            System.out.println("Selecione as opções");
            System.out.println("1 - Cadastrar novo funcionário");
            System.out.println("2 - Exibir as informações de todos "
                    + "os funcionarios cadastrados");
            System.out.println("3 - Buscar funcionario");
            System.out.println("4 - Aumento salarial de um funcionario");
            System.out.println("5 - Exibir dados de um funcionario");
            System.out.println("6 - Demitir um funcionario");
            System.out.println("7 - Sair do programa");
            resp = in.next().charAt(0);
            in.nextLine();
            if (resp == '1') {
                System.out.println("Matricula: ");
                String matricula = in.nextLine();
                System.out.println("Nome: ");
                String nome = in.nextLine();
                System.out.println("Cargo: ");
                String cargo = in.nextLine();
                System.out.println("Salario: ");
                double salario = in.nextDouble();
                System.out.println("Ano de contratação: ");
                int ano = in.nextInt();
                cadastro.cadastro(new Funcionario(matricula, nome, cargo
                        , salario, ano));
            } else if (resp == '2') {
                cadastro.informacoesFuncionarios();
            } else if (resp == '3') {
                System.out.println("Matricula do funcionario buscado:");
                String matricula = in.nextLine();
                cadastro.buscaFuncionario(matricula);
            } else if (resp == '4') {
                System.out.println("Matricula do funcionario: ");
                String matricula = in.nextLine();
                System.out.println("Percentual: ");
                double percentual = in.nextDouble();
                cadastro.aumento(matricula, percentual);
            } else if (resp == '5'){
                System.out.println("Matricula do funcionario: ");
                String matricula = in.nextLine();
                cadastro.dadosUmFuncionario(matricula);
            } else if (resp == '6'){
                System.out.println("Matricula do funcionario demitido: ");
                String matricula = in.nextLine();
                cadastro.demitir(matricula);
            }
        } while (resp != '7');
    }

}
