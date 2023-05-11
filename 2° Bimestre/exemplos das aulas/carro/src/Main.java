public class Main {
    public static void main(String[] args) {
        //Motor motor1 = new Motor(150, 1.6, 8); poderiamos instanciar antes em um objeto

        Carro carro1 = new Carro("azul", "HB20","FMX1234", 2022, new Motor(150, 1.6, 8));
        //ou usando o new direto   :>

        System.out.println(carro1.getMotor().getClassificacao());
        //pega um método de um objeto que tbm é atributo de um outro objeto e tem outro método p mostrar tudo

        for(int i=0; i < 4; i++){
            carro1.addRoda(new Roda(26, 32)); // add/lista 4 rodas iguais
        }

        for (Roda roda:
                carro1.getRodas()) {
            System.out.println(roda.getAro());
        }
    }
}
