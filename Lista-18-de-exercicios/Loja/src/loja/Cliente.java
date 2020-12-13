package loja;

public class Cliente implements Comparable<Cliente> {

    private String cpf;
    private String nome;
    private String email;
    private String fone;

    public Cliente(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String toString() {
        return "-CPF: " + this.getCpf() + " -Nome: " + this.getNome()
                + " -Email: " + this.getEmail() + " -Fone: " + this.getFone();
    }

    @Override
    public int compareTo(Cliente c) {
        return this.getCpf().compareTo(c.getCpf());
    }

    public void alteraEmail(String emailNovo) {
        boolean pode = podeEmail(emailNovo);
        if (pode) {
            this.setEmail(emailNovo);
            System.out.println("Email cadastrado.");
        } else {
            System.out.println("Email inválido.");
        }
    }

    public boolean podeEmail(String emailNovo) {
        int tamanho = emailNovo.length();
        int qtdA = 0;
        boolean pode = true, pode2 = true;
        for (int i = 0; i < tamanho; i++) {
            if (emailNovo.charAt(i) == '@') {
                qtdA++;
                if (qtdA != 1) {
                    pode = false;
                }
            }
            if (!Character.isLetter(emailNovo.charAt(i))
                    && !Character.isDigit(emailNovo.charAt(i))
                    && emailNovo.charAt(i) != '@'
                    && emailNovo.charAt(i) != '.') {
                pode2 = false;
            }
        }
        if (pode && pode2) {
            return true;
        }
        return false;
    }

    public void alteraFone(String foneNovo) {
        boolean pode = podeFone(foneNovo);
        if (pode) {
            this.setFone(foneNovo);
            System.out.println("Fone cadastrado.");
        } else {
            System.out.println("Fone inválido.");
        }
    }

    public boolean podeFone(String foneNovo) {
        int tamanho = foneNovo.length();
        boolean pode = true;
        for (int i = 0; i < tamanho; i++) {
            if (!Character.isDigit(foneNovo.charAt(i))) {
                pode = false;
            }
        }
        if (pode) {
            return true;
        }
        return false;
    }
    
    
}
