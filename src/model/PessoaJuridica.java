package model;

public class PessoaJuridica extends Pessoa {
	private String razaosocial;

	public String getRazaosocial() {
		return razaosocial;
	}

	public void setRazaosocial(String razaosocial) {
		this.razaosocial = razaosocial;
	}
	
	@Override
	public void falar() {
		// TODO Auto-generated method stub
		System.out.println("Falando - Pessoa Juridica");
	}
}
