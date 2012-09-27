/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author Bruno
 */
import java.util.ArrayList;



public class Subtracao implements Iexpressao {

	private ArrayList<Iexpressao> num = new ArrayList<Iexpressao>();

	public Subtracao(){

	}

	public void add(Iexpressao e) throws Exception {
		this.num.add(e);

	}



	public int avaliar() {
		int tmp = num.get(0).avaliar();
		for(int i=1;i<num.size();i++)
			tmp -=num.get(i).avaliar();
		return tmp;
	}

}
