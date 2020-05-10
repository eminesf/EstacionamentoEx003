package Estacionamento;

public class Porsche extends Veiculo {

	private final Integer lugares = 4;
	private Double velocidadeAtual = 0.0;

	public Porsche() {
		super();
	}

	public Porsche(Integer passageiros) {
		super();
		validaLugares(passageiros);
	}

	public void validaLugares(Integer passageiros) {
		System.out.println("Número de passageiros: " + passageiros);
		if (passageiros > lugares) {
			System.out.println("Numero de passageiros excedido.");
		} else
			setPassageiros(passageiros);
	}

	@Override
	public void NumeroLugares() {
		System.out.println("Numero de lugares: " + lugares);
	}

	@Override
	public void acelerar() {
		setVelocidade(20.0);
		velocidadeAtual += getVelocidade();
		System.out.println("velocidade atual: " + velocidadeAtual);
	}
	@Override
	public void frear() {
		velocidadeAtual = 0.0;
		System.out.println("Veiculo freou, velocidade atual: " + velocidadeAtual);
	}
}
