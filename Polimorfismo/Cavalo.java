package Polimorfismo;

public class Cavalo extends Animal{
	
	public Cavalo()
	{
		super("Pé de Pano", 3);
	}
	
	public void emitirSom()
	{
		System.out.println("  Está relinchando");
		System.out.println("  'Ihiiihiihiihii' ");
	}
	
	public void acao()
	{
		System.out.println("\nE também está correndo\n POCOTO POCOTO...");
	}

}
