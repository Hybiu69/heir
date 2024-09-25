package heir;

public class Automovel extends Veiculo{

	private int numeropor;
	private String motor;

	public Automovel(String marca,String modelo,String cor,String motor,int ano,int numeropor) {
		super(marca,modelo,cor,ano);
		this.motor=motor;
		this.numeropor=numeropor;
	}
	public String getMotor () {
		return motor;
	}
	public void setMotor(String motor) {
		this.motor=motor;
	}
	public int getNumeropor() {
		return numeropor;
	}
	public void setNumeropor(int numeropor) {
		this.numeropor=numeropor;
	}

}
