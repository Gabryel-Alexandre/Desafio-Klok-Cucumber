package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TelaDePesquisaPage {
	
	
	@FindBy(xpath = "//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[1]/div/div/div/div[1]/span[1]")
	public WebElement nenhumResultado;
	
	@FindBy(id = "high-price")
	private WebElement campoMaiorPreco;
	
	@FindBy(className = "a-button-input")
	private WebElement botaoIr;
	
	@FindBy(className = "a-price-whole")
	public WebElement itemFiltradoPorPreco;
	
	
	public void inserirNoCampoMaiorPreco(String texto) {
		campoMaiorPreco.sendKeys(texto);
	}
	
	public void clicarNoBotaoIr() {
		botaoIr.click();
	}
	

}
