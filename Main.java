package atividade_pratica_icev;

public class Main {

	public static void main(String[] args) {
		
		Pilha pilha = new Pilha();
		
		String expressao1 = new String();
		String expressao2 = new String();
		
		expressao1 = "x+y*(3+z)";
		expressao2 = "x+y*(3+z";
		
		
		System.out.println("expressao1" + verificar.validar(expressao1));
		System.out.println("expressao2"+ verificar.validar(expressao2));
		
		// o true  é correto e o falso é incorreto.
	}

}
