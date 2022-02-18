package stepsDefinitions;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.TelaDePesquisaPage;
import pageObjects.TelaInicialPage;

import static org.junit.Assert.assertTrue;
import static utils.Utils.*;

public class PesquisaSteps {

	@Quando("eu digitar no campo pesquisa {string}")
	public void euDigitarNoCampoPesquisa(String texto) {
		Na(TelaInicialPage.class).inserirTextoDePesquisa(texto);
	}

	@Quando("clicar no botao confirmar pesquisa")
	public void clicarNoBotaoConfirmarPesquisa() {
		Na(TelaInicialPage.class).clicarNoBotaoConfirmarPesquisa();
	}

	@Entao("o programa valida se a busca por {string} ocorreu")
	public void oProgramaValidaSeABuscaOcorreu(String texto) {
		String campoPesquisado = Na(TelaDePesquisaPage.class).headsetPesquisado.getText();
		
		
		assertTrue(campoPesquisado.toLowerCase().contains(texto));
	}

	

}
