package br.com.Conta.Interface;

public class main {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente ();
		cc.depositar(1200.20);
		cc.sacar(300);
		
		
		ContaPoupanca cp = new ContaPoupanca ();
		cp.depositar(500.50);
		cp.sacar(25);
		
		
		geradosExtratos gerador = new geradosExtratos ();
		gerador.geradorConta(cc);
		gerador.geradorConta(cp);
		
		
		

	}

}
