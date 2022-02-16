package stepsDefinitions;

import static org.junit.Assert.assertEquals;
import static utils.Utils.Na;

import io.cucumber.java.pt.Entao;
import pageObjects.TelaDePesquisaPage;

public class PesquisaErroSteps {
	
	@Entao("o programa valida que {string}")
	public void oProgramaValidaQue(String texto) {
		String campoNenhumItem = Na(TelaDePesquisaPage.class).nenhumResultado.getText();

		assertEquals(texto, campoNenhumItem);
	}

	

	
}
