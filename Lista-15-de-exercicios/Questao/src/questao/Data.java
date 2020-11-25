package questao;

public class Data implements Comparable<Data> {

    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        if (ano < 0) {
            this.ano = 1;
        } else {
            if(mes < 1 || mes > 12){
                mes = 1;
            }
            this.ano = ano;
            if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8
                    || mes == 10 || mes == 12) {
                this.mes = mes;
                if (dia < 1 || dia > 31) {
                    this.dia = 1;
                } else{
                    this.dia = dia;
                }
            } else if (mes == 2) {
                this.mes = mes;
                if (ano % 4 == 0 && ano % 400 == 0) {
                    if (dia < 1 || dia > 29) {
                        this.dia = 1;
                    } else {
                        this.dia = dia;
                    }
                } else {
                    this.mes = mes;
                    if (dia < 1 || dia > 28) {
                        this.dia = 1;
                    } else {
                        this.dia = dia;
                    }
                }
            } else {
                this.mes = mes;
                if (dia < 1 || dia > 30) {
                    this.dia = 1;
                } else{
                  this.dia = dia;  
                }
            }
        }
    }

    private int getDia() {
        return this.dia;
    }

    private void setDia(int dia) {
        this.dia = dia;
    }

    private int getMes() {
        return this.mes;
    }

    private void setMes(int mes) {
        this.mes = mes;
    }

    private int getAno() {
        return this.ano;
    }

    private void setAno(int ano) {
        this.ano = ano;
    }

    public String dataPorExtenso() {
        String[] mesV = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio",
            "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro",
            "Dezembro"};
        return dia + " de " + mesV[mes] + " de " + ano;
    }

    public String toString() {
        return dia + "/" + mes + "/" + ano;
    }

    @Override
    public int compareTo(Data outro) {
        if (this.ano > outro.ano) {
            return 1;
        } else if (this.ano < outro.ano) {
            return -1;
        } else {
            if (this.mes > outro.mes) {
                return 1;
            } else if (this.mes < outro.mes) {
                return -1;
            } else {
                if (this.dia > outro.dia) {
                    return 1;
                } else if (this.dia < outro.dia) {
                    return -1;
                } else {
                    return 0;
                }
            }
        }
    }
}
