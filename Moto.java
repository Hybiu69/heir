package heir;

public class Moto extends Veiculo{

	private int cc;

	public Moto (String marca,String modelo,String cor,int ano,int cc) {
		super(marca,modelo,cor,ano);
		this.cc=cc;

	}
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc=cc;
	}
}