package questao_02;

public class Automovel extends Transporte{
    //Atributos
    private String placa;

    //Métodos públicos
    public Automovel(String marca, String modelo, int quilometragem, double capacidadeTanque, String placa) {
        super(marca, modelo, quilometragem, capacidadeTanque);
        this.placa = placa;
    }

    @Override
    public void mover(int km) {
        super.mover(km);
        setCapacidadeTanque(getCapacidadeTanque() - km/8);
    }

    //Métodos especiais

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public String toString() {
        return super.toString() + "\n placa: " + getPlaca();
    }
}
