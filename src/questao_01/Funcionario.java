package questao_01;

public class Funcionario {
    private String nome, funcao;
    private double salario;
    private static int numFuncionarios;

    public Funcionario(String nome, String funcao, double salario) {
        this.nome = nome;
        this.funcao = funcao;
        this.salario = salario;
    }

    public void aumentarSalario(double aumento){
        double p;
        p=(aumento/100) + 1;
        this.setSalario(this.getSalario() * p);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public static int getNumFuncionarios() {
        return numFuncionarios;
    }

    public static void setNumFuncionarios(int numFuncionarios) {
        Funcionario.numFuncionarios = numFuncionarios;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", funcao='" + funcao + '\'' +
                ", salario=" + salario +
                '}';
    }
}
