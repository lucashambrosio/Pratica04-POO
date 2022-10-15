package br.com.loja.comercial;

public class Adminitrativos extends Funcionarios {
	
	public double salarioFixo;
	public double horasExtras;
	
	
	public Adminitrativos(String nome, String rg, double salarioFixo, double horasExtras) {
		super(nome, rg);
		this.salarioFixo = salarioFixo;
		this.horasExtras = horasExtras;
	}


	public double getSalarioFixo() {
		return salarioFixo;
	}


	public void setSalarioFixo(double salarioFixo) {
		this.salarioFixo = salarioFixo;
	}


	public double getHorasExtras() {
		return horasExtras;
	}


	public void setHorasExtras(double horasExtras) {
		this.horasExtras = horasExtras;
	}
	
	
	
	
	
	

}
