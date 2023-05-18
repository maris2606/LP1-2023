public class Main {
    public static void main(String[] args) {

        Lazer lazer1 = new Lazer("cinema", 25.9, false);
        lazer1.mudarValor(50);

        System.out.println(lazer1.getValor());

    }
}
