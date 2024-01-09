package application;

import java.util.HashMap;
import java.util.Map;

public class ExemploMap {

	public static void main(String[] args) {
		// Criando um mapa usando HashMap
		Map<String, Integer> mapaIdades = new HashMap<>();

		// Adicionando pares chave-valor ao mapa
		mapaIdades.put("Alice", 25);
		mapaIdades.put("Bob", 30);
		mapaIdades.put("Charlie", 22);

		// Imprimindo o mapa
		System.out.println("Mapa de idades: " + mapaIdades);

		// Acessando um valor por chave
		int idadeBob = mapaIdades.get("Bob");
		System.out.println("Idade de Bob: " + idadeBob);

		// Verificando a existência de uma chave
		boolean contemAlice = mapaIdades.containsKey("Alice");
		System.out.println("Contém a chave 'Alice'? " + contemAlice);

		// Iterando sobre as chaves e valores do mapa
		System.out.println("Iterando sobre o mapa:");
		for (Map.Entry<String, Integer> entry : mapaIdades.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue() + " anos");
		}

		// Removendo um par chave-valor
		mapaIdades.remove("Charlie");
		System.out.println("Mapa após remover Charlie: " + mapaIdades);
	}
}
