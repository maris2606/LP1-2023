public class Motor {
    private int potencia;
    private double classificacao;
    private int valvulas;

    public Motor (int potencia, double classificacao, int valvulas){
        this.potencia=potencia;
        this.classificacao=classificacao;
        this.valvulas=valvulas;
    }

    public double getClassificacao() {
        return classificacao;
    }

    public int getPotencia() {
        return potencia;
    }

    public int getValvulas() {
        return valvulas;
    }

    public void setClassificacao(double classificacao) {
        this.classificacao = classificacao;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public void setValvulas(int valvulas) {
        this.valvulas = valvulas;
    }
}
