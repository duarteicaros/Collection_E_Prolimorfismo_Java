package Polimorfismo;

public class Cachorro extends Animal{
	
	public Cachorro()
	{
		super("Galego", 7);
	}
	
	public void emitirSom()
	{
		System.out.println(" Est� latindo");
		System.out.println(" 'Au au au au' ");
	}
	
	public void acao()
	{
		System.out.println("\n E tamb�m est� correndo");
	}

}
