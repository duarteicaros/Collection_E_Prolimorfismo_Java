package Polimorfismo;

public class Cachorro extends Animal{
	
	public Cachorro()
	{
		super("Galego", 7);
	}
	
	public void emitirSom()
	{
		System.out.println(" Está latindo");
		System.out.println(" 'Au au au au' ");
	}
	
	public void acao()
	{
		System.out.println("\n E também está correndo");
	}

}
