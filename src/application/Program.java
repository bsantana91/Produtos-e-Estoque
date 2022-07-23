package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Adicione a informação do produto: ");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Preço: ");
		double preco = sc.nextDouble();
		System.out.print("Quantidade em estoque: ");
		int quantidade = sc.nextInt();
		
		Product produto = new Product(nome, preco, quantidade);
		
		System.out.println("Informação do Produto: " + produto);
		
		System.out.println();
		System.out.print("Digite o número de produtos a ser adicionados no estoque: ");
		quantidade = sc.nextInt();
		produto.addProducts(quantidade);
		
		System.out.println("Informação do Produto Atualizada: " + produto);
		
		System.out.println();
		System.out.print("Digite o número de produtos a ser removidos no estoque: ");
		quantidade = sc.nextInt();
		produto.removeProducts(quantidade);
		
		System.out.println("Informação do Produto Atualizada: " + produto);
		
		sc.close();
	}

}
