/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bruno
 */
public class AnotacoesBrasilFactory extends AbstractFactory{


	public AbstractTelefone criarAnotacaoTel(){
		return new TelefoneBrasil();
	}
	public AbstractEndereco criarAnotacaoEnd(){
		return new EnderecoBrasil();
	}

}
