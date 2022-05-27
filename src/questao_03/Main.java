package questao_03;

public class Main {
    public static void main(String[] args) {
        Usuario u1 = new Usuario("Mateus", "298.885.339-21", 123456);
        Monitor u2 = new Monitor("Hill", "512.321.893-77", 654321);

        Livro l1 = new Livro("Aprendendo Poo", "Aprender", 2345678);
        Livro l2 = new Livro("Redes de computadores", "Saber", 23451);

        Biblioteca bib = new Biblioteca();


        bib.cadastrarLivros(l1);
        bib.cadastrarLivros(l2);
        bib.listarLivros();

        bib.alugarLivro(u1, l1, 40);
        bib.alugarLivro(u2, l2,40);
        bib.listarLivros();

        System.out.println(u1);
    }
}
