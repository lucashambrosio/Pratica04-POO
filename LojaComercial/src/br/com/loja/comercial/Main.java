package br.com.loja.comercial;

import java.util.Scanner;


public class Main implements EntradaDados {
	
	Scanner ler = new Scanner (System.in);
	

	public static void main(String[] args) {
		

	}

	@Override
	public void cadastrarNome(String nome) {
		
	 System.out.println("Digite o nome do Funcionario ");
	 nome = ler.next();
		
		
		
	}

	@Override
	public void cadastrarRg(String rg) {
		
		System.out.println("Digite o RG do funcionario ");
		rg = ler.next();
		
		
	}

	@Override
	public void salarioBase(double valor) {
		System.out.println("Salario Base");
		valor = ler.nextDouble();
		
		
	}

	@Override
	public void comissao(double comissao) {
		
		System.out.println("Comissão: ");
		comissao = ler.nextDouble();
		
		
	}

	@Override
	public void salarioFixo(double salarioFixo) {
		
		System.out.println("Salario fixo: ");
		salarioFixo = ler.nextDouble();		
		
	}

	@Override
	public void horaExtra(int horaExtra) {
		
		System.out.println("Digite quantas horas extras o funcionario tem: ");
		horaExtra = ler.nextInt();
		
		
	}
	
	@Override
	public void vendas(double vendas) {
		
		System.out.println("Valor de vendas ");
		vendas = ler.nextDouble();
		
		
	}

}
