package questao_01;

public class Escola {
    public static void main(String[] args) {
        Funcionario a = new Funcionario("Mateus", "bolsista", 500);
        System.out.println(a);
        a.aumentarSalario(50); //porcentagem
        System.out.println(a + "\n");

        Professor b = new Professor("Hill", "professor", 20000, 5);
        System.out.println(b);
        b.aumentarSalario(10);
        System.out.println(b + "\n");
    }
}
