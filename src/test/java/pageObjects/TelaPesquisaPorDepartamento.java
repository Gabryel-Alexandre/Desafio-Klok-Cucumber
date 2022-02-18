package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class TelaPesquisaPorDepartamento {
	
	//@FindBy(xpath = "//*[@id=\"contentGrid_691599\"]/div/div[2]/div[1]/div/div")
	//@FindBy(className = "bxc-grid__content   bxc-grid__content--light celwidget")
	@FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div[1]/div[2]/div/div/div/div/div[2]/div[1]/div/div/a/img")
	private WebElement pneuDeCarro;
	
	
	public void clicarNoBotaoPneuDeCarro() {
		pneuDeCarro.click();
	}

}
