$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Desafio.feature");
formatter.feature({
  "name": "Pesquisa de Itens",
  "description": "",
  "keyword": "Funcionalidade"
});
formatter.scenario({
  "name": "Entrando no Sistema",
  "description": "",
  "keyword": "Cenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "o programa iniciar",
  "keyword": "Quando "
});
formatter.match({
  "location": "PesquisaSteps.oProgramaIniciar()"
});
formatter.result({
  "status": "passed"
});
});