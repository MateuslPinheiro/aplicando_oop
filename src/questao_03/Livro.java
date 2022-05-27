package questao_03;

public class Livro {
    //Atributos
    private String nome, editora;
    private Boolean statusAlugado;
    private int codigo;
    private Usuario userAluguel;

    //Métodos públicos
    public Livro(String nome, String editora, int codigo) {
        this.nome = nome;
        this.editora = editora;
        this.codigo = codigo;
        this.statusAlugado = false;
        this.userAluguel = null;
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

    public Boolean getStatusAlugado() {
        return statusAlugado;
    }

    public void setStatusAlugado(Boolean statusAlugado) {
        this.statusAlugado = statusAlugado;
    }

    public Usuario getUserAluguel() {
        return userAluguel;
    }

    public void setUserAluguel(Usuario userAluguel) {
        this.userAluguel = userAluguel;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", editora='" + editora + '\'' +
                ", statusAlugado=" + statusAlugado +
                ", codigo=" + codigo +
                '}';
    }
}
