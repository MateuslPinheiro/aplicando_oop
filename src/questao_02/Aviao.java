package questao_02;

public class Aviao extends Transporte{
    private String codigo;


    public Aviao(String marca, String modelo, int quilometragem, double capacidadeTanque, String codigo) {
        super(marca, modelo, quilometragem, capacidadeTanque);
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public void mover(int km) {
        super.mover(km);
        setCapacidadeTanque(getCapacidadeTanque() - km/10);
    }

    @Override
    public String toString() {
        return super.toString() + "\n codigo: " + getCodigo();
    }
}
