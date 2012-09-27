/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bruno
 */
public abstract class AbstractEndereco {
    
    	public abstract void checarCEPZipCode(String num);
	public abstract void gravarRua(String rua);
	public abstract void gravarCidade(String cidade);
	public abstract void gravarCepZipCode(String cep);
	public abstract void exibirCepZipCode(String numero);
    
}
