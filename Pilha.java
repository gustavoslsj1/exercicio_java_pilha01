package atividade_pratica_icev;

import java.util.List;
import java.util.ArrayList;
public class Pilha  {
	private List pilha = new ArrayList();
	
	public void push(char t) {
		pilha.add(t);
	}
	public int size () {
		return pilha.size();
	}
	public char pop() {
		if(isEmpty()) {
			throw new RuntimeException();
		}
		return (char) pilha.remove(size()-1);
	}
	public boolean isEmpty() {
	    return pilha.isEmpty();
	}
	
	public char dp (){
		if(isEmpty()) {
			throw new RuntimeException();
		}
		return (char) pilha.get(size()-1);
	}
	
}


