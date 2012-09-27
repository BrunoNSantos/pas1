/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo;

/**
 *
 * @author Bruno
 */
public class ArmaduraMetal implements ArmaduraInterface{

private int protecao;


	public ArmaduraMetal(){
		this.protecao = 5;
	}
	@Override
	public int getProtecao() {
		return protecao;
	}

}
