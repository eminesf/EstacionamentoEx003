package Estacionamento;

public class Yamaha extends Veiculo {

	private final Integer lugares = 2;
	private Double velocidadeAtual = 0.0;

	public Yamaha() {
		super();
	}

	public Yamaha(Integer passageiros) {
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
		setVelocidade(5.0);
		velocidadeAtual += getVelocidade();
		System.out.println("velocidade atual: " + velocidadeAtual);
	}
	@Override
	public void frear() {
		velocidadeAtual = 0.0;
		System.out.println("Veiculo freou, velocidade atual: " + velocidadeAtual);
	}
}
