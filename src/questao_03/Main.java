package questao_03;

public class Main {
    public static void main(String[] args) {
        Livro a = new Livro("Aprendendo Poo", "Aprender", 2345678);
        Livro b = new Livro("Redes de computadores", "Saber", 23451);

        Biblioteca bib = new Biblioteca();
        bib.cadastrarLivros(a);
        bib.cadastrarLivros(b);

        /*System.out.println(a);
        System.out.println(b);*/
        bib.listarLivros();

        Usuario c = new Usuario("Mateus", "298.885.339-21", 123456);
        Monitor d = new Monitor("Hill", "512.321.893-77", 654321);
        System.out.println(c.alugar(40));
        System.out.println(d.alugar(40));
        System.out.println(c);
        System.out.println(d);

    }
}
