package Polimorfismo;

public class Preguica extends Animal{
	
	public Preguica()
	{
		super("Jurema", 6);
	}
	
	public void emitirSom()
	{
		System.out.println("   Est� bocejando");
		System.out.println("  'ZZZzzzZzzZZzzz...' ");
	}
	
	public void acao()
	{
		System.out.println("\nEnquanto est�:\nSubindo na arvore.");
	}

}
