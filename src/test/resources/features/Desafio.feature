#language: pt
#enconding: UTF-8

Funcionalidade: Pesquisa de Itens

	Cenario: Realizando Pesquisa com Sucesso 
		Quando eu digitar no campo pesquisa "headset"
		E clicar no botao confirmar pesquisa
		Entao o programa valida se a busca por "headset" ocorreu  

	Cenario: Realizando Pesquisa de um item que nao existe
		Quando eu digitar no campo pesquisa "auvqwdfhvqwfhqhfsvhfsf2fe2oujbfhji2fvbhjibef"
		E clicar no botao confirmar pesquisa
		Entao o programa valida que "Nenhum resultado para"
	
		
	Cenario: Realizando Pesquisa de um item e filtrando por preco 
		Quando eu digitar no campo pesquisa "harry potter"
		E clicar no botao confirmar pesquisa
		Entao o programa valida se a busca por "harry potter" ocorreu corretamente
		E inserir no campo preco maximo "40"
		E clicar no botao Ir 
		Entao o programa valida que foi realmente filtrado no preco "40"