package questao_02;

public class Main {
    public static void main(String[] args) {
//        Transporte t = new Transporte("Fiat", "Uno", 15000, 10);
//        Automovel t = new Automovel("Fiat", "Uno", 15000, 10, "QPL-9054");
        Aviao t = new Aviao("Boieng", "GTX1080", 50000, 120, "B0E1NG");
        System.out.println(t);
        t.abastecer(10);
        t.mover(800);
        System.out.println(t);
    }
}
