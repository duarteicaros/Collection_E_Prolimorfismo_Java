package Polimorfismo;

public class Cavalo extends Animal{
	
	public Cavalo()
	{
		super("P� de Pano", 3);
	}
	
	public void emitirSom()
	{
		System.out.println("  Est� relinchando");
		System.out.println("  'Ihiiihiihiihii' ");
	}
	
	public void acao()
	{
		System.out.println("\nE tamb�m est� correndo\n POCOTO POCOTO...");
	}

}
