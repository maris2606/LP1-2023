import java.util.ArrayList;
import java.util.List;

public class Carro {
    private String cor;
    private String modelo;
    private String placa;
    private int ano;
    // deve se criar um atributo pro motor, já que este faz parte das características dele
    private Motor motor; // uma classe usa a outra - é aparentemente um tipo, mas não é...
    private List<Roda> rodas =  new ArrayList<>();

    public Carro(String cor, String modelo, String placa, int ano, Motor motor) {
        this.cor = cor;
        this.modelo = modelo;
        this.placa = placa;
        this.ano = ano;
        this.motor = motor;
    }
    //existe o tipo lista, cada roda add é colocada, ela cresce e não ocupa to.do o espaco inicial

    //botao direito - generate -> selecionar o coiso

    public void addRoda(Roda roda){
        this.rodas.add(roda); //comando para adicionar elemento à lista
    }


    public List<Roda> getRodas() {
        return rodas;
    }

    public void setRodas(List<Roda> rodas) {
        this.rodas = rodas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

}
