import java.security.Key;
import java.util.*;

import javax.swing.Box;

public class recursao {
    public static void main(String[] args) {
        Box caixa_principal = new Box();
        Key chave = new Key();
        procure_pela_chave(caixa_principal, chave);
    }

    public static void procure_pela_chave(Box caixa_principal, Key chave) {
        Stack<Box> pilha = new Stack<>();
        pilha.push(caixa_principal);
        while (!pilha.isEmpty()) {
            Box caixa = pilha.pop();
            for (Item item : caixa.getItems()) { // assuming getItems() returns a List of Item objects
                if (item.isBox()) {
                    pilha.push((Box) item);
                } else if (item.equals(chave)) {
                    System.out.println("Achei a chave");
                    break;
                }
            }
        }
    }
}