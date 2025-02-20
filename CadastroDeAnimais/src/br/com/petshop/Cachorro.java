package br.com.petshop;

	//A classe cachorro herda do animal
public class Cachorro extends Animal {
private String raca;
	
	//construtor para inicializar Cachorro com atributos especificos
public Cachorro(String nome, int idade, String raca) {
	super(nome, idade); //chama o construtor da classe base
	this.raca = raca;
}
	//método especifico para latir
public void latir() {
	System.out.println(getNome() + "está latindo: Au Au!");
}
}
