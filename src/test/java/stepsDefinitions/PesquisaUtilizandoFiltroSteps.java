package stepsDefinitions;


import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.TelaDePesquisaPage;

import static org.junit.Assert.assertTrue;
import static utils.Utils.Na;


public class PesquisaUtilizandoFiltroSteps {

	@Quando("inserir no campo preco maximo {string}")
	public void inserirNoCampoPrecoMaximo(String preco) {
	   Na(TelaDePesquisaPage.class).inserirNoCampoMaiorPreco(preco);
	}

	@Quando("clicar no botao Ir")
	public void clicarNoBotaoIr() {
	   Na(TelaDePesquisaPage.class).clicarNoBotaoIr();
	}

	@Entao("o programa valida que foi realmente filtrado no preco {string}")
	public void oProgramaValidaQueFoiRealmenteFiltradoNoPreco(String precoDoFiltroString) {
	   String precoString = Na(TelaDePesquisaPage.class).itemFiltradoPorPreco.getText();
	   
	   int preco = Integer.parseInt(precoString);
	   
	   int precoDoEscritoNoFiltro = Integer.parseInt(precoDoFiltroString);
	
	   
	   assertTrue(preco <= precoDoEscritoNoFiltro);
}

	@Entao("^o programa valida se a busca por \"([^\"]*)\" ocorreu corretamente$")
	public void oProgramaValidaSeABuscaPorOcorreuCorretamente(String texto) throws Throwable {
		String campoPesquisado = Na(TelaDePesquisaPage.class).itemHarryPotter.getText();

		assertTrue(campoPesquisado.toLowerCase().contains(texto));
	}
		

}
