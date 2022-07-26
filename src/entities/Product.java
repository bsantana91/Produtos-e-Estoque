package entities;

public class Product {
	
	public String nome;
	public double preco;
	public int quantidade;
	
	//* os nomes abaixo podem ser diferentes dos de acima, mas por conven��o utiliza-se os mesmos *//
	
	public Product(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	public double totalValueInStock() {
		return preco * quantidade;
	}
	
	public void addProducts(int quantidade) {
		this.quantidade += quantidade;
	}
	
	public void removeProducts(int quantidade) {
		this.quantidade -= quantidade;
	}
	
	public String toString() {
		return nome
			+ ", $ " + String.format("%.2f", preco) + ", "
			+ quantidade + " unidades, Total: $ "
			+ String.format("%.2f", totalValueInStock()); 
	}

}
