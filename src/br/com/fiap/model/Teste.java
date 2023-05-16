package br.com.fiap.model;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {

		Cliente c = new Cliente();

		Scanner in = new Scanner(System.in);
		
		Endereco enderecoCliente = new Endereco();

		System.out.println("Digite o id do cliente: ");
		int id = in.nextInt();
		c.setId(id);
		
		System.out.println("Digite o pais onde mora");
		String pais = in.next();
		enderecoCliente.setPais(pais);
		
		System.out.println("Digite a cidade onde mora");
		String cidade = in.next();
		enderecoCliente.setCidade(cidade);
		
		
		System.out.println("Digite o estado onde mora");
		String estado = in.next();
		enderecoCliente.setEstado(estado);
		
		
		System.out.println("Digite o bairro onde mora");
		String bairro = in.next();
		enderecoCliente.setBairro(bairro);
		
		c.setEndereco(enderecoCliente);
		
		System.out.println("Estado do cliente: " + c.getEndereco().getEstado());
	}
}
