package Polimorfismo;

import java.io.IOException;
import java.util.Scanner;

public class ExecutaAnimal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x;

		Cachorro cachorro = new Cachorro();
		Cavalo cavalo = new Cavalo();
		Preguica preguica = new Preguica();
		Animal animal = null;

		do {
			System.out.println("==========================");
			System.out.println("  _______________ ");
			System.out.println(" |    ESCOLHA    |");
			System.out.println(" |_______________|");
			System.out.printf(
					"\n  --------------- " + "\n |1-Para Cachorro|" + "\n |2-Para Cavalo  |" + "\n |3-Para Preguiça|"
							+ "\n |0-Para Encerrar|" + "\n  ---------------" + "\n\nDigite sua escolha: ");
			x = sc.nextInt();

			switch (x) {
			case 1:
				animal = cachorro;
				System.out.println("---------------------------\n---------------------------");
				System.out.println("\nO animal de nome " + animal.getNome());
				System.out.println("Tem " + animal.getIdade() + " anos de idade");
				System.out.println("==========================");
				animal.emitirSom();
				animal.acao();
				System.out.println("==========================");
				animal.pulaLinha();
				break;

			case 2:
				animal = cavalo;
				System.out.println("---------------------------\n---------------------------");
				System.out.println("\nO animal de nome " + animal.getNome());
				System.out.println("Tem " + animal.getIdade() + " anos de idade");
				System.out.println("==========================");
				animal.emitirSom();
				animal.acao();
				System.out.println("==========================");
				animal.pulaLinha();
				break;

			case 3:
				animal = preguica;
				System.out.println("---------------------------\n---------------------------");
				System.out.println("\nO animal de nome " + animal.getNome());
				System.out.println("Tem " + animal.getIdade() + " anos de idade");
				System.out.println("==========================");
				animal.emitirSom();
				animal.acao();
				System.out.println("==========================");
				animal.pulaLinha();
				break;

			default:
				System.out.println("\n;*******************;" + "\n| DIGITE UMA OPÇÃO |" + "\n|      VALIDA      |"
						+ "\n'*******************'");
				animal.pulaLinha();
			}
		} while (x != 0);
	}
}
