package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TelaInicialPage {
	
	
	@FindBy(id = "twotabsearchtextbox")
	private WebElement barraInputDePesquisa;
	
	@FindBy(id = "nav-search-submit-button")
	private WebElement botaoConfirmarPesquisa;
	
	
	public void inserirTextoDePesquisa(String texto) {
		barraInputDePesquisa.sendKeys(texto);
	}
	
	public void clicarNoBotaoConfirmarPesquisa() {
		botaoConfirmarPesquisa.click();
	}

}
