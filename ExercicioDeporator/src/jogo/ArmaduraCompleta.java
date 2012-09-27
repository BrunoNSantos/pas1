/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo;

/**
 *
 * @author Bruno
 */
public class ArmaduraCompleta implements ArmaduraInterface{

private int protecao;


	public ArmaduraCompleta(){
		this.protecao = 10;
	}
	@Override
	public int getProtecao() {
		return protecao;
	}

}
