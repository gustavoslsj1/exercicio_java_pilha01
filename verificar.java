package atividade_pratica_icev;

public class verificar {


	public static boolean validar(String expressao) {
        Pilha pilha = new Pilha();
        char[] caracteres = expressao.toCharArray();

        for (char c : caracteres) {
            if (c == '(' || c == '{' || c == '[') {
                pilha.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (pilha.isEmpty()) {
                    return false;
                }
                char topo = pilha.pop();
                if ((c == ')' && topo != '(') || (c == '}' && topo != '{') || (c == ']' && topo != '[')) {
                    return false;
                }
            }
        }

        return pilha.isEmpty();
    }
}
