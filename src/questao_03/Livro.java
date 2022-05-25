package questao_03;

public class Livro {
    //Atributos
    private String nome, editora;
    private int codigo;
    private static int numLivros = 50;

    //Métodos públicos

    public Livro(String nome, String editora, int codigo) {
        this.nome = nome;
        this.editora = editora;
        this.codigo = codigo;
    }


    //Métodos especiais


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public static int getNumLivros() {
        return numLivros;
    }

    public static void setNumLivros(int numLivros) {
        Livro.numLivros = numLivros;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", editora='" + editora + '\'' +
                ", codigo='" + codigo + '\'' +
                '}';
    }
}
