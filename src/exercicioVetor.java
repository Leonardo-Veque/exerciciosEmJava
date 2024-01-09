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
        } else if (resposta == 4) {
            exercicio4(args);
        } else if (resposta == 5) {
            exercicio5(args);
        } else if (resposta == 6) {
            exercicio6(args);
        } else if (resposta == 7) {
            exercicio7(args);
        } else if (resposta == 8) {
            exercicio8(args);
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

        }
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                pares++;
                System.out.println("Números pares são: " + vetor[i]);
            }

        }
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 3 == 0 && vetor[i] % 5 == 0) {
                div++;
                System.out.println("Os números divisíveis por 5 e 3 são: " + vetor[i]);
            }
        }
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < 10) {
                menoresDez++;
                System.out.println("Números menores que dez: " + vetor[i]);
            }
        }
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > 100) {
                maioresDez++;
                System.out.println("Números maiores que 100: " + vetor[i]);
            } else if (vetor[i] < 0) {
                negativo++;
                System.out.println("Números negativos: " + vetor[i]);

            }
        }
        for (int i = 0; i < vetor.length; i++) {
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

    public static void exercicio4(String[] args) {
        int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho do vetor"));
        int[] vetor = new int[tamanho];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite os numeros do vetor"));

        }
        for (int i = vetor.length - 1; i >= 0; i--) {
            System.out.println("Vetor invertido: " + vetor[i]);

        }
    }

    public static void exercicio5(String[] args) {
        int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho dos vetores"));
        int[] vetor1 = new int[tamanho];
        int[] vetor2 = new int[tamanho];
        int mult = 0;

        for (int i = 0; i < vetor1.length; i++) {
            vetor1[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite os numeros do vetor"));

        }
        for (int i = 0; i < vetor2.length; i++) {
            vetor2[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite os numeros do vetor"));

        }
        for (int i = 0; i < vetor1.length; i++) {
            mult = vetor1[i] * vetor2[i];

            System.out.println(vetor1[i] + "x" + vetor2[i] + "=" + mult);
        }
    }

    public static void exercicio6(String[] args) {
        int[] vetor = new int[20];
        int maior = 0;
        int menor = 0;
        int igual = 0;

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite os numeros do vetor"));
        }

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > vetor[0]) {
                maior++;
            } else if (vetor[i] < vetor[0]) {
                menor++;
            } else {
                igual++;
            }

        }
        System.out.println("Numeros maiores que o primeiro elemento: " + maior);
        System.out.println("Numeros menor que o primeiro elemento: " + menor);
        System.out.println("Numeros igual que o primeiro elemento: " + igual);

    }

    public static void exercicio7(String[] args) {
        int r = 5;
        int s = 10;
        int[] vetor = new int[r];
        int j = 0;
        int[] vetor2 = new int[s];
        int[] juncao = new int[15];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite os numeros do primeiro vetor: "));
        }
        for (int i = 0; i < vetor2.length; i++) {
            vetor2[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite os numeros do segundo vetor"));
        }

        for (int i = 0; i < juncao.length; i++) {
            if (i < r) {
                juncao[i] = vetor[i];
            } else {
                juncao[i] = vetor2[j];
                j++;
            }

        }
        for (int i = 0; i < juncao.length; i++) {
            System.out.println(juncao[i]);
        }
    }

    public static void exercicio8(String[] args) {
        int[] vetor = new int[10];

        int j = 9;

        int k = 0;

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite os numeros do primeiro vetor: "));
        }

        for (int i = 0; i < 5; i++) {
            k = vetor[i];
            vetor[i] = vetor[j];
            vetor[j] = k;
            j--;
        }

        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }
}