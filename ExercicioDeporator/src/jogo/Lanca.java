/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo;

/**
 *
 * @author Bruno
 */
public class Lanca implements ArmaInterface {

	private int dano;

	public Lanca(){
		this.dano = 20;
	}

	@Override
	public int getDano() {
		return dano;
	}

}
