public class Dado {
    int dado, dado2, dado3;
    int max = 6, min = 1;
    int range = max - min + 1;

    public int tirarDados() {
        dado = (int) (Math.random() * range) + min;
        return dado;
    }

    public void imprimirDados(int n) {
        System.out.println("DADO " + n);
    }

    public int getDado() {
        return dado;
    }
}
