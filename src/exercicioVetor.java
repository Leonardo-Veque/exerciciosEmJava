import javax.swing.JOptionPane;

public class exercicioVetor {
    public static void main(String[] args) {
        int resposta = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero do exercicio"));

        if (resposta == 1) {
            exercicio1(args);
        } else if (resposta == 2) {
            exercicio2(args);
        } else if (resposta == 3) {
            exercicio3(args);
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

    public static void exercicio3(String[] args) {
        int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho do vetor"));
        int[] vetor = new int[tamanho];

        int pares = 0;
        int div = 0;
        int menoresDez = 0;
        int maioresDez = 0;
        int negativo = 0;
        int maiores = 0;

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite os numeros do vetor"));

            if (vetor[i] % 2 == 0) {
                pares++;
                System.out.println("Números pares são: " + vetor[i]);
            }
            if (vetor[i] % 3 == 0 && vetor[i] % 5 == 0) {
                div++;
                System.out.println("Os números divisíveis por 5 e 3 são: " + vetor[i]);
            }
            if (vetor[i] < 10) {
                menoresDez++;
                System.out.println("Números menores que dez: " + vetor[i]);
            }
            if (vetor[i] > 100) {
                maioresDez++;
                System.out.println("Números maiores que 100: " + vetor[i]);
            } else if (vetor[i] < 0) {
                negativo++;
                System.out.println("Números negativos: " + vetor[i]);

            }
            if (vetor[i] > 10 && vetor[i] < 100) {
                maiores++;
                System.out.println("Números entre 10 e 100: " + vetor[i]);
            }
        }
        System.out.println("Total de números pares: " + pares);
        System.out.println("Total de números divisíveis por 5 e 3: " + div);
        System.out.println("Total de números menores que dez: " + menoresDez);
        System.out.println("Total de números maiores que 100: " + maioresDez);
        System.out.println("Total de números negativos: " + negativo);
        System.out.println("Total de números entre 10 e 100: " + maiores);
    }
}