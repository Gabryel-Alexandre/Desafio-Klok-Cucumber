package stepsDefinitions;


import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.TelaDePesquisaPage;

import static org.junit.Assert.assertTrue;
import static utils.Utils.Na;
import static utils.Utils.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


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
	   
	   int precoEscritoNoFiltro = Integer.parseInt(precoDoFiltroString);
	
	   
	   assertTrue(preco <= precoEscritoNoFiltro);
}

	@Entao("^o programa valida se a busca por \"([^\"]*)\" ocorreu corretamente$")
	public void oProgramaValidaSeABuscaPorOcorreuCorretamente(String texto) throws Throwable {

		WebElement itemNaSegundaPosicaoDePesquisa = driver.findElements(By.xpath("/html/body/div[1]/div[2]/div[1]/div[1]/div/span[3]/div[2]/div[4]/div/div/div")).get(0);
		
		String campoPesquisado = itemNaSegundaPosicaoDePesquisa.getText();
		
		assertTrue(campoPesquisado.toLowerCase().contains(texto));
	}
		

}
