$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Desafio.feature");
formatter.feature({
  "name": "Pesquisa de Itens",
  "description": "",
  "keyword": "Funcionalidade"
});
formatter.scenario({
  "name": "Realizando Pesquisa com Sucesso",
  "description": "",
  "keyword": "Cenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "eu digitar no campo pesquisa \"mouse\"",
  "keyword": "Quando "
});
formatter.match({
  "location": "PesquisaSteps.euDigitarNoCampoPesquisa(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicar no botao confirmar pesquisa",
  "keyword": "E "
});
formatter.match({
  "location": "PesquisaSteps.clicarNoBotaoConfirmarPesquisa()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o programa valida se a busca por \"mouse\" ocorreu",
  "keyword": "Entao "
});
formatter.match({
  "location": "PesquisaSteps.oProgramaValidaSeABuscaOcorreu(String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Realizando Pesquisa de um item que nao existe",
  "description": "",
  "keyword": "Cenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "eu digitar no campo pesquisa \"auvqwdfhvqwfhqhfsvhfsf2fe2oujbfhji2fvbhjibef\"",
  "keyword": "Quando "
});
formatter.match({
  "location": "PesquisaSteps.euDigitarNoCampoPesquisa(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicar no botao confirmar pesquisa",
  "keyword": "E "
});
formatter.match({
  "location": "PesquisaSteps.clicarNoBotaoConfirmarPesquisa()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o programa valida que \"Nenhum resultado para\"",
  "keyword": "Entao "
});
formatter.match({
  "location": "PesquisaErroSteps.oProgramaValidaQue(String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded1.png", null);
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Realizando Pesquisa de um item e filtrando por preco",
  "description": "",
  "keyword": "Cenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "eu digitar no campo pesquisa \"harry potter\"",
  "keyword": "Quando "
});
formatter.match({
  "location": "PesquisaSteps.euDigitarNoCampoPesquisa(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicar no botao confirmar pesquisa",
  "keyword": "E "
});
formatter.match({
  "location": "PesquisaSteps.clicarNoBotaoConfirmarPesquisa()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o programa valida se a busca por \"harry potter\" ocorreu corretamente",
  "keyword": "Entao "
});
formatter.match({
  "location": "PesquisaUtilizandoFiltroSteps.oProgramaValidaSeABuscaPorOcorreuCorretamente(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "inserir no campo preco maximo \"40\"",
  "keyword": "E "
});
formatter.match({
  "location": "PesquisaUtilizandoFiltroSteps.inserirNoCampoPrecoMaximo(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicar no botao Ir",
  "keyword": "E "
});
formatter.match({
  "location": "PesquisaUtilizandoFiltroSteps.clicarNoBotaoIr()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o programa valida que foi realmente filtrado no preco \"40\"",
  "keyword": "Entao "
});
formatter.match({
  "location": "PesquisaUtilizandoFiltroSteps.oProgramaValidaQueFoiRealmenteFiltradoNoPreco(String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded2.png", null);
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Realizando Pesquisa por uma categoria e nao escrevendo nada",
  "description": "",
  "keyword": "Cenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "eu clicar no dropdown de categorias",
  "keyword": "Quando "
});
formatter.match({
  "location": "PesquisaPorCategoriaSteps.euClicarNoDropdownDeCategorias()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicar no departamento \"Automotivo\"",
  "keyword": "E "
});
formatter.match({
  "location": "PesquisaPorCategoriaSteps.clicarNoDepartamento(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicar no botao confirmar pesquisa",
  "keyword": "E "
});
formatter.match({
  "location": "PesquisaSteps.clicarNoBotaoConfirmarPesquisa()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o programa valida que foi pesquisado por \"Automotivo\"",
  "keyword": "Entao "
});
formatter.match({
  "location": "PesquisaPorCategoriaSteps.oProgramaValidaQueFoiPesquisadoPor(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicar na imagem de pneu de carro",
  "keyword": "E "
});
formatter.match({
  "location": "PesquisaPorCategoriaSteps.clicarNaImagemDePneuDeCarro()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o programa valida que a pesquisa para \"pneu\" foi concluida",
  "keyword": "Entao "
});
formatter.match({
  "location": "PesquisaPorCategoriaSteps.oProgramaValidaQueAPesquisaParaFoiConcluida(String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded3.png", null);
formatter.after({
  "status": "passed"
});
});