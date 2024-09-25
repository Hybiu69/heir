package heir;

public class PessoaJus extends Pessoa {
	
	private String cnpj;
	
	public PessoaJus (String nome,String telefone, String cnpj) {
		super(nome,telefone);
		this.cnpj=cnpj;

	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj=cnpj;
	}

}