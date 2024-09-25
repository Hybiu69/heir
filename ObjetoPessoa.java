package heir;

public class ObjetoPessoa {

	public static void main(String[] args) {

		Pessoa pessoa = new Pessoa ("João da Silva","(11) 9999-9999");

		System.out.println("Pessoa:");
		System.out.println("Nome: " + pessoa.getNome());
		System.out.println("Telefone: " + pessoa.getTelefone());

		PessoaFis pessoafis = new PessoaFis ("João da Silva","(11) 9999-9999","123.456.789-00","300");

		System.out.println("\nPessoa Física");
		System.out.println("Nome: " + pessoafis.getNome());
		System.out.println("Telefone: "+ pessoafis.getTelefone());
		System.out.println("CPF: " + pessoafis.getCpf());
		System.out.println("RG: " + pessoafis.getRg());

		PessoaJus pessoajus = new PessoaJus ("EmpresaXYZ","(11) 9999-9999","123.456.78/0001-23");

		System.out.println("\nPessoa Jurídica");
		System.out.println("Nome: " + pessoajus.getNome());
		System.out.println("Telefone: " + pessoajus.getTelefone());
		System.out.println("CNPJ: " +pessoajus.getCnpj());

	}

}
