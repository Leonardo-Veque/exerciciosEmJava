import java.util.Scanner;

import javax.print.attribute.standard.JobHoldUntil;
import javax.swing.JOptionPane;

public class ExercicioIF {
    public static void main(String[] args) {
        int resposta = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero do exercicio"));

        if (resposta == 1) {
            exercio1(args);

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

        } else if (resposta == 9) {
            exercicio9(args);

        } else if (resposta == 10) {
            exercicio10(args);

        } else if (resposta == 11) {
            exercicio11(args);
        } else {
            System.out.println("Não existe esse exercicio");
        }
    }

    public static void exercio1(String[] args) {
        int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));

        if (valor % 2 == 1) {
            System.out.println("O numero é impar");

        } else {
            System.out.println("O numero é par");
        }
    }

    public static void exercicio2(String[] args) {
        float valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));

        float centimetros = valor * 100;
        float decimetros = valor * 10;
        float milimetros = valor * 1000;

        System.out.println("Valor em milimetros é:" + milimetros);
        System.out.println("Valor em centimetros é: " + centimetros);
        System.out.println("Valor em decimetros é: " + decimetros);
    }

    public static void exercicio3(String[] args) {
        int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite qual tabuada:"));
        int multiplicanto[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        for (int i = 0; i <= multiplicanto.length; i++) {

            int tabuada = multiplicanto[i] * valor;
            System.out.println(valor + "x" + multiplicanto[i] + "=" + tabuada);
        }

    }

    public static void exercicio4(String[] args) {
        float valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));

        if (valor > 5 && valor < 20) {
            System.out.println("O valor está no intervalo 5 e 20");

        } else {
            System.out.println("O valor não esta nesse intervalo");
        }

    }

    public static void exercicio5(String[] args) {
        float valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));

        if (valor < 0) {
            System.out.println("Numero negativo");
        } else if (valor == 0) {
            System.out.println("Valor 0");
        } else {
            System.out.println("Valor positivo");
        }
    }

    public static void exercicio6(String[] args) {
        int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia da semana"));

        if (valor == 1) {
            System.out.println("Dia é segunda-Feira");

        } else if (valor == 2) {
            System.out.println("Dia é terça-Feira");
        } else if (valor == 3) {
            System.out.println("Dia é quarta-Feira");
        } else if (valor == 4) {
            System.out.println("Dia é quinta-Feira");
        } else if (valor == 5) {
            System.out.println("Dia é sexta-Feira");
        } else if (valor == 6) {
            System.out.println("Dia é sabado");
        } else if (valor == 7) {
            System.out.println("Dia é domingo");
        } else {
            System.out.println("Coloque um valor correspondende ao dia da semana");
        }

    }

    public static void exercicio7(String[] args) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero"));
        int soma = 0;

        if (num1 > num2) {
            soma = num1 + num2;
            System.out.println("Sua soma é: " + soma);
        } else if (num1 < num2) {
            soma = num1 * num2;
            System.out.println("Sua soma é:" + soma);
        } else {
            soma = num1 - num2;
            System.out.println("Sua soma é:" + soma);
        }
    }

    public static void exercicio8(String[] args) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero"));

        int soma = num1 + num2;
        System.out.println("Sua soma: " + soma);

        int produto = num1 * (num2 * num2);
        System.out.println("Seu produto pelo quadrado do segundo: " + produto);

        int quadrado = num1 * num1;
        System.out.println("O quadrado do primeiro: " + quadrado);

        System.out.println("Sua raiz:" + Math.sqrt(soma));

        double modulo = Math.abs(num1);
        System.out.println("seu modulo: " + modulo);

    }

    public static void exercicio9(String[] args) {
        float preco = Integer.parseInt(JOptionPane.showInputDialog("Digite o preço"));
        float infration = 0;
        float produto = 0;

        if (preco < 100) {
            infration = (preco * 10) / 100;
            produto = preco + infration;
            System.out.println("Preco do produto: " + produto);
        } else {
            infration = (preco * 20) / 100;
            produto = preco + infration;
            System.out.println("Preco do produto: " + produto);
        }
    }

    public static void exercicio10(String[] args) {
        String pessoaString = JOptionPane.showInputDialog("Digite a letra");

        if (pessoaString.equals("J") || pessoaString.equals("j")) {
            System.out.println("Pessoa Jurídica");
        } else if (pessoaString.equals("F") || pessoaString.equals("f")) {
            System.out.println("Pessoa Física");
        } else {
            System.out.println("Digite a letra J ou F");
        }
    }

    public static void exercicio11(String[] args) {
        int senha = Integer.parseInt(JOptionPane.showInputDialog("Digite a senha: "));

        if (senha == 34567) {
            System.out.println("Acesso autorizado");
        } else {
            System.out.println("Senha errada");
        }
    }

}
