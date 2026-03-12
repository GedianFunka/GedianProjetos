package POO_DO_While_ArrayList;

import java.util.*;

public class ListaNome_POO_ArrayList_e_DoWhile {

	private ArrayList <String> nomes = new ArrayList<>();
	
	public void adicionarNome(String nome) {
		nomes.add(nome);
		System.out.println("Adicioanando");
	}
	
	public void ListarNomes() {
		if(nomes.isEmpty()) {
			System.out.println("Lista vazia");
		}else {
			System.out.println("Nomes cadastrados : ");
		for(String total: nomes) {
			System.out.println(total);
		}
		
		}
	}

	public void removerNome(String nome) {
		if(nomes.remove(nome)) {
			System.out.println("Nome removido");
		}else {
			System.out.println("Não encontrado");
		}
	}
	
	public void bsucarNome(String nome) {
		if(nomes.contains(nome)) {
			int posicao = nomes.indexOf(nome);
			System.out.println("Encontrado na posição : " + (posicao + 1) );
		}else {
			System.out.println("Nome não encontrado");
		}
	}
	public boolean listaVazia() {
        return nomes.isEmpty();
    }
}