package br.com.petshop;

import java.util.ArrayList;
import java.util.Scanner;

//Classe principal que gerencia o sistema de cadastro de animais
public class Petshop {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Animal> animais = new ArrayList<>(); //Lista
		int opcao;
		
		do {
			//Exibição do menu de opções
			System.out.println("\n===MENU===");
			System.out.println("1- Cadastrar Cachorro");
			System.out.println("2- Cadastrar Gato");
			System.out.println("3- Exibir Animais");
			System.out.println("4- Sair");
			System.out.println("Escola uma opção");
			opcao = scanner.nextInt();
			scanner.nextLine(); // Consumir a quebra de Linha
			
			switch(opcao) {
			case 1:
				System.out.println("Nome do cachorro:");
				String nomeCachorro = scanner.nextLine();
				System.out.println("Idade do cachorro:");
				int idadeCachorro = scanner.nextInt();
				scanner.nextLine();
				System.out.println("Raça do cachorro:");
				String raca = scanner.nextLine();
				animais.add(new Cachorro(nomeCachorro, idadeCachorro, raca));
				System.out.println("Cachorro cadastrado com sucesso.");
				break;
			
			case 2:
				System.out.println("Nome do gato: ");
				String nomeGato = scanner.nextLine();
				System.out.println("Idade do gato: ");
				int idadeGato = scanner.nextInt();
				scanner.nextLine();
				System.out.println("Cor do pelo do gato: ");
				String corDoPelo = scanner.nextLine();
				animais.add(new Gato(nomeGato, idadeGato, corDoPelo));
				System.out.println("Gato cadastrado com sucesso!");
				break;

			case 3:
				System.out.println("\nLista de Animais");
				for(Animal animal : animais ) {
					animal.exibirInfo();
					break;
				}
			
			
			case 4:
				System.out.println("Encerrando o programa...");
				break;
				default:
				System.out.println("Opção Inválido! Tente novamente.");
				break;
		}
	}
	while (opcao != 4);
	}
}
