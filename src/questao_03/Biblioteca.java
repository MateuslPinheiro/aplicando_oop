package questao_03;

import java.util.ArrayList;

public class Biblioteca {
    public ArrayList<Livro> livros;

    public Biblioteca(){
        this.livros = new ArrayList<Livro>();
    }

    public void cadastrarLivros(Livro l){
        this.livros.add(l);
    }
    public void listarLivros() {
        int i;
        for (i=0;i<this.livros.size();i++){
            System.out.println(this.livros.get(i));
        }
        System.out.println("\n");
    }

    public void alugarLivro(Usuario user, Livro liv, int dias) {
        liv.setStatusAlugado(true);
        user.alugar(liv, dias);
//        liv.setUserAluguel(user);
    }
}
