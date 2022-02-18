package stepsDefinitions;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.TelaInicialPage;

import static org.junit.Assert.assertTrue;
import static utils.Utils.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


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
		
		WebElement itemNaSegundaPosicaoDePesquisa = driver.findElements(By.xpath("/html/body/div[1]/div[2]/div[1]/div[1]/div/span[3]/div[2]/div[8]/div")).get(0);
		
		String  campoPesquisado = itemNaSegundaPosicaoDePesquisa.getText();
		
		assertTrue(campoPesquisado.toLowerCase().contains(texto));
	}

}
