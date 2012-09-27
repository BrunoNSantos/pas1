/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo;

/**
 *
 * @author Bruno
 */
public class Faca implements ArmaInterface {

	private int dano;

	public Faca(){
		this.dano = 5;
	}

	@Override
	public int getDano() {
		return dano;
	}

}
