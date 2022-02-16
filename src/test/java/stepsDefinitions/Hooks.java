package stepsDefinitions;

import io.cucumber.java.Before;

import static utils.Utils.*;

public class Hooks {
	
	@Before
	public void setUp() {
		acessarSistema();
	}

}
