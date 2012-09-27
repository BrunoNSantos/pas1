/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo;

/**
 *
 * @author Bruno
 */
public class ArmaduraCouro implements ArmaduraInterface {

	private int protecao;


	public ArmaduraCouro(){
		this.protecao = 2;
	}
	@Override
	public int getProtecao() {
		return protecao;
	}

}
