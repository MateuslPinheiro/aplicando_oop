package questao_02;

public class Transporte {
    //Atributos
    protected String marca, modelo;
    protected int quilometragem;
    protected double capacidadeTanque;

    //Métodos públicos
    public Transporte(String marca, String modelo, int quilometragem, double capacidadeTanque) {
        this.marca = marca;
        this.modelo = modelo;
        this.quilometragem = quilometragem;
        this.capacidadeTanque = capacidadeTanque;
    }

    public void mover(int km){
        this.setQuilometragem(getQuilometragem() + km);
    }

    public void abastecer (double l){
        this.setCapacidadeTanque(getCapacidadeTanque() + l);
    }

    //Métodos especiais

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(int quilometragem) {
        this.quilometragem = quilometragem;
    }

    public double getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(double capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    @Override
    public String toString() {
        return "Transporte{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", quilometragem=" + quilometragem +
                "km, capacidadeTanque=" + capacidadeTanque + "l" +
                '}';
    }
}
