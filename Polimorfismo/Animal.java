package Polimorfismo;

public abstract class Animal {
	
	private String nome;
	private int idade;
	
	abstract public void emitirSom();
	abstract public void acao();
	
	public Animal(String nome, int idade)
	{
		this.nome = nome;
		this.idade = idade;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome() {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade() {
		this.idade = idade;
	}
	
	public void pulaLinha()
	{
		System.out.println("\n\n");
	}
	

}
