package heir;

public class ObjetoVeiculo {

	public static void main(String[] args) {

		Veiculo veiculo = new Veiculo("Mazda","RX-7","Preto",2002);
		
		System.out.println("Veiculo:");
		System.out.println("Marca: " + veiculo.getMarca());
		System.out.println("Modelo: " + veiculo.getModelo());
		System.out.println("Cor: " + veiculo.getCor());
		System.out.println("Ano: " + veiculo.getAno());
		
		Automovel veiculo1 = new Automovel("Ford","MUSTANG SHELBY GT-500","Prata/Azul","V8 32V",2008,4);
		
		System.out.println("\nVeiculo:");
		System.out.println("Marca: " + veiculo1.getMarca());
		System.out.println("Modelo: " + veiculo1.getModelo());
		System.out.println("Cor: " + veiculo1.getCor());
		System.out.println("Ano: " + veiculo1.getAno());
		System.out.println("Motor: " + veiculo1.getMotor());
		System.out.println("Portas: " + veiculo1.getNumeropor());
		
		Moto veiculo2 = new Moto ("Honda","NX 350 SAHARA","Braca/Azul/Vermelha",1989,350);
		
		System.out.println("\nMoto:");
		System.out.println("Marca: " + veiculo2.getMarca());
		System.out.println("Modelo: " + veiculo2.getModelo());
		System.out.println("Cor: " + veiculo2.getCor());
		System.out.println("Ano: " + veiculo2.getAno());
		System.out.println("Cilindradas: " + veiculo2.getCc());

	}
}