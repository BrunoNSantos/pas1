/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo;

/**
 *
 * @author Bruno
 */
public class PoderDeVeneno extends Decorator{

	private int dano;

	public PoderDeVeneno(ArmaInterface arma) {
		super(arma);
		this.dano = 3;
	}

	public int getDano(){
		return super.getDano()+this.dano;
	}
}
