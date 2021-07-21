public class Dijkstra{

    public void Djikstra(Digrafo di, int s) {
        int[] pais = new int[di.v];
        int[] custos = new int[di.v];
        int infinito = (di.k*di.v)+1;

        int v,w;
        Arco p;

        for (v = 0; v < di.v; v++){
            custos[v] = infinito;
            pais[v] = -1;
        }

        Fila c = new Fila(di.v);
        custos[s] = 0;
        pais[s] = s;

        c.insere(s,custos);

        while(!c.PQEmpty()){
            v = c.PQdelmin(custos);
            for (int i = 0; i < di.vertices[v].size(); i++){
                p = di.vertices[v].get(i);

                if (custos[w = p.verticeDestino] == infinito){
                    custos[w] = custos[v] + p.peso;
                    pais[w] = v;
                    c.insere(w,custos);
                } else if(custos[w] > custos[v] + p.peso){
                    custos[w] = custos[v] + p.peso;
                    pais[w] = v;
                    c.PQdec(w,custos);
                }
            }
        }
    }
}
