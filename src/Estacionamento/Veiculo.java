package Estacionamento;

public abstract class Veiculo {

	private Double velocidade;
	private Integer passageiros;
	private Boolean verificaEstacionado = false;

	public Veiculo() {

	}

	public Veiculo(Integer passageiros) {
		super();
		this.passageiros = passageiros;
	}

	public Double getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(Double velocidade) {
		this.velocidade = velocidade;
	}

	public Integer getPassageiros() {
		return passageiros;
	}

	protected void setPassageiros(Integer passageiros) {
		this.passageiros = passageiros;
	}

	public void acelerar() {
		this.velocidade += 1;
	}

	public void frear() {
		this.velocidade -= 1;
	}

	public void NumeroLugares() {

	}

	public Boolean getVerificaEstacionado() {
		if (verificaEstacionado == true) {
			System.out.println("Veiculo estacionado");
			return verificaEstacionado;
		} else {
			System.out.println("Veiculo não esta estacionado");
			return verificaEstacionado;
		}

	}

	public void setVerificaEstacionado(Boolean verificaEstacionado) {
		this.verificaEstacionado = verificaEstacionado;
	}

}
