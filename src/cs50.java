import javax.swing.JOptionPane;

public class cs50 {
    public static void main(String[] args) {
        int resposta = Integer.parseInt(JOptionPane.showInputDialog("Digite a aula que voce quer fazer?"));

        if (resposta == 1) {
            lecture1(args);
        }
    }

    public static void lecture1(String[] args) {
        String resposta = JOptionPane.showInputDialog("Qual é seu nome?");

        System.out.println("Ola " + resposta);
    }
}
