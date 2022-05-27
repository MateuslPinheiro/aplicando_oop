package questao_03;

public class Monitor extends Usuario{

    public Monitor(String nome, String CPF, int matricula) {
        super(nome, CPF, matricula);
    }

    @Override
    public String alugar(Livro livro, int dias) {
        this.livrosAlugados.add(livro);
        if (dias<30){
            return "Livro devolvido no prazo";
        } else if (dias==31) {
            return "Aluguel excedeu o limite de " + (dias - 30) + " dia.\nSua muta é de 1 real";
        } else {
            return "Aluguel excedeu o limite de " + (dias - 30) + " dias.\nSua muta é de " + ((dias - 30) * 1) + " reais";
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
