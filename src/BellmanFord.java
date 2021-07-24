/*
    EP2 AED2 - Turma 94 - Alexandre Freire
    Gustavo Ryan Nascimento Silva - 11796785
    Bruno Daniel Moreira Plada - 11796274
 */

public class BellmanFord {
    public void bellman_ford(Digrafo di, int v){
        int vertice, w;
        Arco p;
        int custos[] = new int[di.v];
        int infinito = (di.k*di.v)+1;
        int[] pais = new int[(di.k*di.v) + 1];

        for (vertice = 0; vertice < di.v; vertice++){
            custos[vertice] = infinito;
            pais[vertice] = -1;
        }

        custos[v] = 0;

        for (int k = 0; k < di.v; k++){
            for (vertice = 0; vertice < di.v; vertice++){
                for (int l = 0; l < di.vertices[v = vertice].size(); l++) {
                    p = di.vertices[v = vertice].get(l);
                    w = p.verticeDestino;
                    if (custos[w] > custos[v] + p.peso) {
                        custos[w] = custos[v] + p.peso;
                        pais[w] = v;
                    }
                }
            }
        }
    }
}
