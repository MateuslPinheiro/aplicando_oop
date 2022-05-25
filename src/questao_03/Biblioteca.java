package questao_03;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Livro> livros;

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
    }
}
