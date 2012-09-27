/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bruno
 */
import java.util.*;


public class TelefoneBrasil extends AbstractTelefone{


	List <String> telefonesBR;

	public TelefoneBrasil(){
		this.telefonesBR = new ArrayList<String>();
	}

	public void gravar(String num){
			telefonesBR.add(num);
	}

	public void exibir(String num){

		String res = null;
		for(int i = 0; i < telefonesBR.size(); i++){
			if( telefonesBR.get(i).equals(num)){
				res = telefonesBR.get(i);
			}

		}
		System.out.println("(55)"+res.substring(0, 4)+"-"+res.substring(4, 8));
	}

}
