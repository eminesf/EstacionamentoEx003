package Estacionamento;

public class Manobrista {

	public void estacionar(Veiculo veiculo) {
		veiculo.setVerificaEstacionado(true);
	}
	public void retirarCarro(Veiculo veiculo) {
		veiculo.setVerificaEstacionado(false);
	}
	

}
