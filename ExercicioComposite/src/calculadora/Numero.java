/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author Bruno
 */
public class Numero implements Iexpressao {
	private int n;

	public Numero(int n) {
		this.n = n;
	}

	public int avaliar() {
		return n;
	}

	public void add(Iexpressao e) throws Exception {
		throw new Exception();

	}
}
