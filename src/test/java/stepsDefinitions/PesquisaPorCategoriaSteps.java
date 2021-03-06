package stepsDefinitions;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.TelaInicialPage;
import pageObjects.TelaPesquisaPorDepartamento;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static utils.Utils.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PesquisaPorCategoriaSteps {

	
	@Quando("eu clicar no dropdown de categorias")
	public void euClicarNoDropdownDeCategorias() {
	  Na(TelaInicialPage.class).clicarNoDropdownDeCategorias();
	}

	
	@Quando("clicar no departamento {string}")
	public void clicarNoDepartamento(String string) {
		 Na(TelaInicialPage.class).clicarNoBotaoCategoriaAutomotivo();
	}

	@Entao("o programa valida que foi pesquisado por {string}")
	public void oProgramaValidaQueFoiPesquisadoPor(String textoDaPesquisa) {
	   WebElement elemento =  driver.findElements(By.xpath("/html/body/div[1]/div[2]/div[2]/div[1]/div[1]/div/div/div/div/div[1]/div/div/div/h1")).get(0);
	   String textoDoElemento = elemento.getText();
	   
	   assertEquals(textoDoElemento,textoDaPesquisa);
	
	}
	
	
	@Entao("clicar na imagem de pneu de carro")
	public void clicarNaImagemDePneuDeCarro() {
	   Na(TelaPesquisaPorDepartamento.class).clicarNoBotaoPneuDeCarro();
	}

	@Entao("o programa valida que a pesquisa para {string} foi concluida")
	public void oProgramaValidaQueAPesquisaParaFoiConcluida(String texto) {
			
	WebElement elementoPesquisa = driver.findElements(By.xpath("/html/body/div[1]/div[2]/div[2]/div[1]/div[1]/div/h1/b")).get(0);
		
	String textoDoElemento =  elementoPesquisa.getText();
	
	assertTrue(textoDoElemento.toLowerCase().contains(texto));
	}


}
