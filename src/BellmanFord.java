public class BellmanFord {
    public void bellmand_ford(Digrafo di, int v){
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

        for (int k = 1; k < di.v; k++){
            for (vertice = 0; vertice < di.v; vertice++){
                p = di.vertices[v = vertice].get(k);

                while(p != null){
                    w = p.verticeDestino;
                    if (custos[w] > custos[v] + p.peso){
                        custos[w] = custos[v] + p.peso;
                        pais[w] = v;
                    }

                }
            }
        }
    }
}
