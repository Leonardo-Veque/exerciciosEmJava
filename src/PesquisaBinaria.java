public class PesquisaBinaria {
    public static void main(String[] args) {
        System.out.println("Aqui");
        pesquisaBinaria(args);
    }

    public static void pesquisaBinaria(String[] args) {
        int lista[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int item = 9;
        int baixo = 0;
        int alto = lista.length - 1;
        System.out.println(alto);

        while (baixo <= alto) {
            int meio = ((baixo + alto) / 2);
            int chute = lista[meio];

            if (chute == item) {
                int resultado = meio + 1;
                System.out.println("Sua posição é: " + resultado);
            }
            if (chute > item) {
                alto = meio - 1;
            } else {
                baixo = meio + 1;
            }
        }
    }
}
