public class JugarDados {
    Dado dadoObj = new Dado();
    int dado;
    int victorias = 0;

    void jugar () {
        int dadoActual;
        int victoria=0;

        for (int i = 0; i < 3; i++) {
            dadoObj.tirarDados();
            dadoActual = dadoObj.getDado();
            dadoObj.imprimirDados(dadoActual);
            if (dado == dadoActual){
                victoria++;
            }
        }
        if (victoria==1){
            System.out.println("Victoria");
            victorias++;
        }
    }
}
