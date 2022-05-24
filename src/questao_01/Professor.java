package questao_01;

public class Professor extends Funcionario{
    private int numDisciplinas;

    public Professor(String nome, String funcao, double salario, int numDisciplinas) {
        super(nome, funcao, salario);
        int p;
        p = numDisciplinas;
        if (p < 2){
            System.out.println("Só se emprega aqui quem tem 2 disciplinas, meu chapa!");
            this.setNumDisciplinas(2);
        } else {
            this.numDisciplinas = numDisciplinas;
        }
    }
    @Override
    public void aumentarSalario(double aumento){
        double p;
        p = (aumento/100) + 1;
        setSalario((getSalario() * p) + (100 * getNumDisciplinas()));
    }

    public int getNumDisciplinas() {
        return numDisciplinas;
    }

    public void setNumDisciplinas(int numDisciplinas) {
        this.numDisciplinas = numDisciplinas;
    }

    @Override
    public String toString() {
        return "Professor{" + super.toString() +
                "\n{numDisciplinas = " + numDisciplinas +
                '}';
    }
}
