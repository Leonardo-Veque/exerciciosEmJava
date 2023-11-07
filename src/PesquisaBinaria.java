import javax.swing.JOptionPane;

public class PesquisaBinaria {
    public static void main(String[] args) {
        System.out.println("Aqui");
        pesquisaBinaria(args);
    }

    public static void pesquisaBinaria(String[] args) {
        int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho do vetor"));
        int lista[] = new int[tamanho];
        int item = 3;
        for (int i = 0; i < lista.length; i++) {
            lista[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite os numeros do vetor"));
            int baixo = 0;
            int alto = lista.length - 1;
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
}
