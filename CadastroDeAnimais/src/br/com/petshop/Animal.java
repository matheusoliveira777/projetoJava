package br.com.petshop;

//classe base animal
public class Animal {
	private String nome;
	private int idade;
	
	//Construir para inicializar o objeto Animal
public Animal( String nome, int idade) {
	this.nome = nome;
	this.idade = idade;
}
	
	//métodos para obter valores dos atributos
public String getNome( ) {
	return nome;
}

public int getIdade( ) {
	return idade;
}


	//método para exibir informação do animal
public void exibirInfo( ) {
	System.out.println ("Nome: " + nome + ", idade: " + idade + " anos ");
}

}

