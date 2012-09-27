/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.ArrayList;

/**
 *
 * @author Bruno
 */
public class Divisao implements Iexpressao {

	private ArrayList<Iexpressao> num = new ArrayList<Iexpressao>();

	public Divisao(){

	}

	public void add(Iexpressao e) throws Exception {
		num.add(e);

	}


	public int avaliar() {
		int tmp = 0;
		if(!num.isEmpty()){

			tmp = num.get(0).avaliar();
			for(int i=1; i<num.size() ;i++){
				tmp = tmp / num.get(i).avaliar();
			}
		}
		return tmp;
	}

}
