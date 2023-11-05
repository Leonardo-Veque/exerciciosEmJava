import javax.swing.JOptionPane;

public class exercicioVetor {
    public static void main(String[] args) {
        int resposta = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero do exercicio"));

        if (resposta == 1) {
            exercicio1(args);

        } else if (resposta == 2) {
            exercicio2(args);
        } else {
            System.out.println("Não existe esse exercicio");
        }
    }

    public static void exercicio1(String[] args) {
        String tamanho = JOptionPane.showInputDialog("Digite o tamanho do vetor");
        int tmanhoVetor = Integer.parseInt(tamanho);
        String[] fala = new String[tmanhoVetor];

        for (int i = 0; i < fala.length; i++) {
            fala[i] = JOptionPane.showInputDialog("Digite oq voce quer?");
        }

        for (int i = 0; i < fala.length; i++) {
            System.out.println(fala[i]);
        }
    }

    public static void exercicio2(String[] args) {
        int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho do vetor"));
        int[] vetor = new int[tamanho];
        int impar = 0;

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite os numeros do vetor"));
            if (vetor[i] % 2 != 0) {
                impar = vetor[i];
                System.out.println("Numeros impares:" + impar);
            }
        }

    }
}