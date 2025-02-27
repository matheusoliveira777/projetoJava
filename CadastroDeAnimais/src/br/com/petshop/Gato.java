package br.com.petshop;

public class Gato extends Animal {
    private String corDoPelo;

    public Gato(String nome, int idade, String corDoPelo) {
        super(nome, idade);
        this.corDoPelo = corDoPelo;
    }

    public void miar() {
        System.out.println(getNome() + " está miando: Miau Miau!");
    }

    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Cor do Pelo: " + corDoPelo);
    }
}

