package Polimorfismo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class LojaCollection {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int escolha;
		String produto, atualizacao;
		
		Collection<String> estoque = new ArrayList();
		
		estoque.add("Banana");
		estoque.add("Limão");
		estoque.add("Mexerica");
		
		System.out.println("Na lista de estoque temos:\n\n"+estoque);
		do
		{
			System.out.println("\n==========================");
			System.out.println("  _______________ ");
			System.out.println(" |    ESCOLHA    |");
			System.out.println(" |_______________|");
			System.out.printf("\n1 -Para Armazenar Produto"
					+ "\n2 -Para Remover Produto"
					+ "\n3 -Para Atualizar Lista"
					+ "\n4 -Para Mostrar lista"
					+ "\n0 -Para Fechar o programa"
					+ "\n\n Digite sua escolha:");
			escolha = sc.nextInt();
			
			
			if(escolha == 1)
			{
				System.out.println("\nDigite o nome do produto a ser adicionado: ");
				produto = sc.next();
				estoque.add(produto);
			}
			else if(escolha == 2)
			{
				System.out.println("\nNo estoque temos os seguintes itens:\n"+estoque);
				System.out.println("\nDigite o nome do produto a ser removido: ");
				produto = sc.next();
				estoque.remove(produto);
			}
			else if(escolha == 3)
			{
				System.out.println("\nNo estoque temos os seguintes itens:\n"+estoque);
				System.out.println("\nDigite a atualização ");
				atualizacao = sc.next();
				
				System.out.println("Digite o nome do produto a ser atualizado: ");
				produto = sc.next();
				
				
				
				if(estoque.contains(produto))
				{
					estoque.remove(produto);
					estoque.add(atualizacao);
					System.out.println("\nO produto foi adicionado!");
					System.out.println("\nNo estoque agora temos:\n"+estoque);
				}
				else
				{
					System.out.println("Digite um produto da lista\n");
				}
				
			}
			else if(escolha == 4)
			{
				System.out.println("\nNo estoque agora temos:\n"+estoque);
			}
		}
		while(escolha != 0);
			
			System.out.println("\n:***********************:" +"\n|Programa finalizado com|"+"\n|       SUCESSO!!!      |"
					+ "\n'***********************'");
			System.out.println("\nSeu estoque agora tem:\n"+estoque);
	}
}
