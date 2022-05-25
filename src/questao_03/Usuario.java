package questao_03;

public class Usuario {
    //Atributos
    protected String nome, CPF;
    protected int matricula;

    //Métodos públicos

    public Usuario(String nome, String CPF, int matricula) {
        this.nome = nome;
        this.CPF = CPF;
        this.matricula = matricula;
    }

    public String alugar(int dias){
        if (dias<15){
            return "Livro devolvido no prazo";
        } else if (dias==16) {
            return "Aluguel excedeu o limite de " + (dias - 15) + " dia.\nSua muta é de 1 real";
        } else {
            return "Aluguel excedeu o limite de " + (dias - 15) + " dias.\nSua muta é de " + ((dias - 15) * 1) + " reais";
        }
    }

    //Métodos especiais

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }


    @Override
    public String toString() {
        return "Usuario{" +
                "nome='" + nome + '\'' +
                ", CPF='" + CPF + '\'' +
                ", matricula=" + matricula +
                '}';
    }
}
