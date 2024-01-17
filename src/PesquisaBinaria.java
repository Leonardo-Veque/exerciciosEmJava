import java.util.Arrays;

import javax.swing.JOptionPane;

public class PesquisaBinaria {
    public static void main(String[] args) {
        System.out.println("Aqui");
        pesquisaBinaria(args);
        ordenacao(args);
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

    public static int buscarMenor(int[] array, int inicio) {
        int menor = array[inicio];
        int menorIndice = inicio;

        for (int i = inicio; i < array.length; i++) {
            if (array[i] < menor) {
                menor = array[i];
                menorIndice = i;
            }
        }
        return menorIndice;

    }

    public static void ordenacao(String[] args) {
        int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho do vetor"));
        int[] novoArray = new int[tamanho];

        for (int i = 0; i < novoArray.length; i++) {
            novoArray[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite os numeros do vetor"));
        }

        for (int i = 0; i < novoArray.length - 1; i++) {
            int menorIndice = buscarMenor(novoArray, i);
            int temp = novoArray[menorIndice];
            novoArray[menorIndice] = novoArray[i];
            novoArray[i] = temp;
        }

        System.out.println(Arrays.toString(novoArray));
    }
}
