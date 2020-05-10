package Estacionamento;

public class EstacionamentoTeste {
	public static void main(String[] args) {

		LandRover LandRoverUm = new LandRover(5);
		Porsche PorscheUm = new Porsche(4);
		Yamaha YamahaUm = new Yamaha(2);
		Manobrista manobristaUm = new Manobrista();
		Manobrista manobristaDois = new Manobrista();
		System.out.println();



		
		LandRoverUm.acelerar();
		LandRoverUm.acelerar();
		LandRoverUm.frear();
		manobristaUm.estacionar(LandRoverUm);
		System.out.println(LandRoverUm.getVerificaEstacionado());
		System.out.println();
		
		
		PorscheUm.acelerar();
		PorscheUm.acelerar();
		PorscheUm.frear();
		manobristaDois.estacionar(PorscheUm);
		System.out.println(PorscheUm.getVerificaEstacionado());
		manobristaDois.retirarCarro(PorscheUm);
		System.out.println(PorscheUm.getVerificaEstacionado());
		System.out.println();
		
		YamahaUm.acelerar();
		YamahaUm.acelerar();
		YamahaUm.frear();
		System.out.println(YamahaUm.getVerificaEstacionado());
		manobristaUm.estacionar(YamahaUm);
		System.out.println(YamahaUm.getVerificaEstacionado());
		System.out.println();

		
	}

}
