/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author Bruno
 */
public interface Iexpressao {
    public int avaliar();
    public void add(Iexpressao e) throws Exception;
}
