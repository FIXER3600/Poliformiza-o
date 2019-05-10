package view;

import model.Pessoa;
import model.PessoaFisica;
import model.PessoaJuridica;

public class Execucao {
	public static void main (String args[]) {
		//Pessoa pessoa = new Pessoa();
		PessoaFisica pf= new PessoaFisica();
		PessoaJuridica pj = new PessoaJuridica();
		
		pf.setNome("Guilherme");
		System.out.println(pf.getNome());
		pf.falar();
		
		pj.setRazaosocial("Etec Zona Leste");
		System.out.println(pj.getRazaosocial());
		pj.falar();
		
		/*pessoa.setEndereco("Rua Pierre Varney");
		 System.out.println(pessoa.get.Endereco());
		 */
		
	}
}
