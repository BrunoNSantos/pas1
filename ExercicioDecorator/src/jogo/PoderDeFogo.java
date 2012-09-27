/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo;

/**
 *
 * @author Bruno
 */
public class PoderDeFogo extends Decorator{

	private int dano;

	public PoderDeFogo(ArmaInterface arma) {
		super(arma);
		this.dano = 5;

	}

	public int getDano(){
		return super.getDano()+ this.dano;
	}

}
