
package br.uffs.cc.jarena;

public class Valmor extends Agente
{
	public Valmor(Integer x, Integer y, Integer energia) {
		super(350, 350, energia);
		setDirecao(BAIXO);
	}
	
	public boolean batalha;

	public void pensa() {
		if(!podeMoverPara(getDirecao())) {
			setDirecao(geraDirecaoAleatoria());
		}
		if(batalha) {
			isParado();
			enviaMensagem("Atacar");
			int cont = 10;
			for(int i = 0; i > 10; i++) {
				cont++;
				if(getId() == cont) {
					setDirecao(getX());
				}
			}
		}
	}
	
	public void recebeuEnergia() {
		if(podeDividir() && getEnergia() >= 900) {
			divide();
		}
	}
	
	public void tomouDano(int energiaRestanteInimigo) {
		batalha = true;
		para();
		if(getId() == 5 || getId() == 6 || getId() == 7 || getId() == 8 || getId() == 9 || getId() == 10 || getId() == 11){
			setDirecao(geraDirecaoAleatoria());
		}
	}
	
	public void ganhouCombate() {
		if(podeDividir()){
			divide();
		} else{
			if(gastaEnergia(50)){
				setDirecao(geraDirecaoAleatoria());
			}
		}
	}
	
	public void recebeuMensagem(String msg) {
	}
	
	public String getEquipe() {
		return "Valmor";
	}
}
