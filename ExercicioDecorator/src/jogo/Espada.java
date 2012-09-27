/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo;

/**
 *
 * @author Bruno
 */
public class Espada implements ArmaInterface {

	private int dano;


	public Espada(){
		dano = 10;
	}
	@Override
	public int getDano() {
		return dano;
	}

}
