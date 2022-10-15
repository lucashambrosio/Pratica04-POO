package br.com.loja.comercial;

public class Vendedores extends Funcionarios {
	
	public double salarioBase;
	public double comissao;
	public 
	
	

	public Vendedores(String nome, String rg, double salarioBase, double comissao) {
		super(nome, rg);
		this.salarioBase = salarioBase;
		this.comissao = comissao;
	}



	public double getSalarioBase() {
		return salarioBase;
	}



	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}



	public double getComissao() {
		return comissao;
	}



	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	
	public double totalVendas () {
		
		return 0;
		
	     
		
	}
	
	public double salarioTotal () {
		
		return 0;
	}
	
	
	

}
