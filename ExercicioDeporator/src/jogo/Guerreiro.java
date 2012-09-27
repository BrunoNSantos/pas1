/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo;

/**
 *
 * @author Bruno
 */
public class Guerreiro {

	private String nome;
	private ArmaInterface arma;
	private int energia;
	private ArmaduraInterface armadura;

	public Guerreiro(String nome){
		this.nome = nome;
		this.arma = new Faca();
		this.energia = 100;
		this.armadura = new ArmaduraCouro();

	}

	public void setArma(ArmaInterface ar){
		this.arma = ar;
	}

	public void setArmadura(ArmaduraInterface armad){
		this.armadura = armad;
	}

	public ArmaduraInterface getArmadura(){
		return this.armadura;
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getEnergia() {
		return energia;
	}

	public void setEnergia(int energia) {
		this.energia = energia;
	}

	public void atacar(Guerreiro g){
		int dano = this.arma.getDano()-g.getArmadura().getProtecao();
		if (dano < 0)
			dano = 0;
		g.setEnergia(g.getEnergia()-dano);
		System.out.println(this.nome + " tirou " + dano + " pontos de energia de "+ g.getNome());
	}

}
