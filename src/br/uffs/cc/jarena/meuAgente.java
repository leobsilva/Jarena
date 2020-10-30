package br.uffs.cc.jarena;

public class meuAgente extends Agente
{
	public meuAgente(Integer x, Integer y, Integer energia) {
		super(350, 350, energia);
		setDirecao(BAIXO);
	}

	public void pensa() {
		
		if(!podeMoverPara(getDirecao())) {
			
			setDirecao(geraDirecaoAleatoria());
		}
		
		
		if(podeDividir() && getEnergia() >= 1000) {
			divide();
		}
	}
	
	public void recebeuEnergia() {
		
	}
	
	public void tomouDano(int energiaRestanteInimigo) {
		
	}
	
	public void ganhouCombate() {
		
	}
	
	public void recebeuMensagem(String msg) {
		
	}
	
	public String getEquipe() {
		return "meuAgente";
	}
}
