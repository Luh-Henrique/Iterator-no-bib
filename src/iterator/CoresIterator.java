package iterator;

class Cores {

	String nome;

	Cores(String nome) {
		this.nome = nome;
	}
}

interface Iterator {
	boolean hasNext();
	Object next();
}

public class CoresIterator implements Iterator {

	Cores[] itens;
	int posicao = 0;

	public CoresIterator(Cores[] itens) {
		this.itens = itens;
	}

	public Object next() {
		Cores cores = itens[posicao];
		posicao++;
		return cores;
	}

	public boolean hasNext() {
		if (posicao >= itens.length || itens[posicao] == null) {
			return false;
		} else {
			return true;
		}
	}
}
