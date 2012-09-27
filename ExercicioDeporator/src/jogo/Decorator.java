/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo;

/**
 *
 * @author Bruno
 */
public class Decorator implements ArmaInterface {

	private ArmaInterface arma = null;

	public Decorator(ArmaInterface arma) {
		this.arma = arma;
	}

	@Override
	public int getDano() {
		return arma.getDano();
	}

}
