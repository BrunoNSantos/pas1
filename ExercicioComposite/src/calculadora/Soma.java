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
import java.util.List;

public class Soma implements Iexpressao {

	private List <Iexpressao> num = new ArrayList<Iexpressao>();

	public Soma(){

	}

	public void add(Iexpressao n){
		num.add(n);
	}



	public int avaliar(){
		int result = 0;
		for(int i=0; i < num.size(); i++)
			result += num.get(i).avaliar();
		return result;
	}



}
