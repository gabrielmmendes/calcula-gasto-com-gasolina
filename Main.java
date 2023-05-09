public class Main {
    public static void main(String[] args) {
        float precoGasolina = 5.59f;
        float kilometrosPercorridos = 170;
        float AUTONOMIA_UP = 14;
        float valorFinal;

        valorFinal = (kilometrosPercorridos / AUTONOMIA_UP) * precoGasolina;
        System.out.println(valorFinal);
    }
}
