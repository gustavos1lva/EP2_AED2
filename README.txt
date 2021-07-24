*****************************************************************************************
*	ACH2024-2021 Algoritmos e Estrutura de Dados					*
*											*
*	Profº Alexandre Freire								*
*											*
*	Turma 94									*
*											*
*	EP 2 (1/2): Caminhos minimos em Grafos (Dijkstra, DAG-Min, Bellman-Ford)	*	*											*
*											*
*	Bruno Daniel Moreira Plada / NUSP: 11796274					*
*											*
*	Gustavo Ryan Nascimento Silva / NUSP 11796785					*
*****************************************************************************************

Caminhos minimos em Grafos (Dijkstra, DAG-Min, Bellman-Ford)

------------------CONTEUDO DA PASTA----------------------
Arco.java
BellmanFord.java
DagMin.java
Digrafo.java
Dijkstra.java
Fila.java
Main.java

---------------------COMO TESTAR-------------------------
Ao iniciar o Main, o usuário recebera as seguintes opções:
1. Criar um digrafo (Iniciará a criação de um dígrafo)
2. Testar digrafo ja existente (Iniciará os menus de teste de algoritmos de busca no dígrafo criado anteriormente)
3. Encerrar o programa

1 - CRIAÇÃO DE UM DÍGRAFO:
	O programa pedirá:
		O número de vértices.
		A probabilidade de se inserir um arco.
		O grau máximo que um arco pode ter.
	
	Logo em seguida o usuário deve escolher se o dígrafo se trata de um dígrafo 	esporadico ou se será obrigatoriamente um DAG (opções 1 e 2).

	Após a escolha o programa confirma a criação da estrutura e retorna ao menu inicial.

2 - TESTE DE UM ALGORITMO NO DÍGRAFO
	Ao selecionar esta opção o usuário receberá 3 opções de algoritmos para teste:

		1: Dijkstra
		2: DAGMin
		3: BellmanFord

	Onde poderá usar o 1 e 3 em ambas as estruturas ou todos no caso de se tratar de um DAG.
	
	Após escolher qualquer um dos algoritmos, o programa perguntará a partir de qual
vértice o usuário deseja iniciar sua busca.

	Ao fim do algoritmo será devolvido o tempo de execução do mesmo em milissegundos e voltará ao menu inicial.



-------------------METODOS CRIADOS-----------------------

Os métodos foram criados em diferentes classes .java:

[Digrafo.java:]

	Parâmetros: 
			
		-int v - numero de vertices
		-int a - numero de arcos
		-int k - peso maximo dos arcos

	Métodos:
		
		- public Digrafo() - Construtor
		- public void inicializaVertices()
		- public void insercaoAleatoria() - faz a insercao de arcos aleatoriamente
		- public void insercaoAleatoriaDAG() - faz a insercao de arcos aleatoriamente garantindo que seja um DAG
		- public void imprimePesos() - método para testes que imprime os pesos dos arcos
		- public void mostraDigrafo() - método para testes que imprime os vértices do grafo e seus arcos
		
			

[Arco.java:]

	Parâmetros:
	
		-int verticeInicio
		-int verticeDestino
		-int peso (custo do caminho)

	Métodos:

		-public Arco(int verticeInicio, int verticeDestino, int peso): construtor da classe


[BellmanFord.java:]

	Parâmetros:	nenhum
	
	Métodos:	

		-public void bellman_ford(Digrafo, int vertice):
		
			recebe um digrafo e um vertice de referência e encontra nele o caminho de menor custo com o algoritmo de Bellman-Ford


[DAGMin.java:]
	
	Parâmetros: nenhum
	
	Métodos: 
		
		-public void DagMin(Digrafo, int vertice):

			recebe um digrafo e um vertice de referência e encontra nele o caminho de menor custo com o algoritmo de DAGMin

[Dijkstra.java:]

	Parâmetros: nenhum

	Métodos:
		
		-public void Dijkstra(Digrafo, int vertice):

			recebe um digrafo e um vertice de referência e encontra nele o caminho de menor custo com o algoritmo de Dijkstra.

[Fila.java:] - Fila usada na organização do algoritmo de Dijkstra.


[Main.java:] - Método main com o menu de execução do programa.
