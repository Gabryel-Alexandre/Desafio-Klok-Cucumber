package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TelaInicialPage {
	
	
	@FindBy(id = "twotabsearchtextbox")
	private WebElement barraInputDePesquisa;
	
	@FindBy(id = "nav-search-submit-button")
	private WebElement botaoConfirmarPesquisa;
	
	@FindBy(xpath = "//*[@id=\"searchDropdownBox\"]")
	private WebElement botaoDropdownCategorias;
	
	@FindBy(xpath = "//*[@id=\"searchDropdownBox\"]/option[5]")
	private WebElement botaoCategoriaAutomotivo;
	
	public void inserirTextoDePesquisa(String texto) {
		barraInputDePesquisa.sendKeys(texto);
	}
	
	public void clicarNoBotaoConfirmarPesquisa() {
		botaoConfirmarPesquisa.click();
	}
	
	public void clicarNoDropdownDeCategorias() {
		botaoDropdownCategorias.click();
	}
	
	public void clicarNoBotaoCategoriaAutomotivo() {
		botaoCategoriaAutomotivo.click();
	}

}
