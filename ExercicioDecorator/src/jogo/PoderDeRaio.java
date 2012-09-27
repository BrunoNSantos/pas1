/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo;

/**
 *
 * @author Bruno
 */
public class PoderDeRaio extends Decorator{

	private int dano;

	public PoderDeRaio(ArmaInterface arma) {
		super(arma);
		this.dano = 10;
	}

	public int getDano(){
		return super.getDano()+this.dano;
	}

}
