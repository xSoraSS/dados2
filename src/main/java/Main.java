import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Quieres jugar unas partidas de dados?     1.Si       2.No");
        int opcion = sc.nextInt();

        if (opcion == 1) {
            JugarDados jugar = new JugarDados();
            jugar.jugar();
        }
    }
}
