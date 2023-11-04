import javax.swing.JOptionPane;

public class exercicioVetor {
    public static void main(String[] args) {
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
}