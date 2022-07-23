package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product produto = new Product();
		
		System.out.println("Adicione a informa��o do produto: ");
		System.out.print("Nome: ");
		produto.nome = sc.nextLine();
		System.out.print("Pre�o: ");
		produto.preco = sc.nextDouble();
		System.out.print("Quantidade em estoque: ");
		produto.quantidade = sc.nextInt();
		
		System.out.println("Informa��o do Produto: " + produto);
		
		System.out.println();
		System.out.print("Digite o n�mero de produtos a ser adicionados no estoque: ");
		int quantidade = sc.nextInt();
		produto.addProducts(quantidade);
		
		System.out.println("Informa��o do Produto Atualizada: " + produto);
		
		System.out.println();
		System.out.print("Digite o n�mero de produtos a ser removidos no estoque: ");
		quantidade = sc.nextInt();
		produto.removeProducts(quantidade);
		
		System.out.println("Informa��o do Produto Atualizada: " + produto);

	}

}
