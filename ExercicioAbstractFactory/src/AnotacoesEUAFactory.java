/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bruno
 */
public class AnotacoesEUAFactory extends AbstractFactory{

	public AbstractTelefone criarAnotacaoTel(){
		return new TelefoneEUA();
	}
	public AbstractEndereco criarAnotacaoEnd(){
		return new EnderecoEUA();
	}

}
