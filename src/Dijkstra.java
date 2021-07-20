public class Dijkstra{

    public void Djikstra(Digrafo di, int s) {
        int[] pais = new int[di.v];
        int[] custos = new int[di.v];

        int v,w;
        Arco p;

        for (v = 0; v < di.v; v++){
            custos[v] = (di.k*di.v)+1;
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

                if (custos[w = p.verticeDestino] == (di.k*di.v)+1){
                    custos[w] = custos[v] + p.peso;
                    pais[w] = v;
                    c.insere(w,custos);
                } else if(custos[w] > custos[v] + di.vertices[v].get(w).peso){
                    custos[w] = custos[v] + di.vertices[v].get(w).peso;
                    pais[w] = v;
                    c.PQdec(w,custos);
                }
            }
        }

        for (int j = 0; j < custos.length; j++){
            System.out.println("Vertice: " + j + " tem custo: " + custos[0] + " do vertice inicial");
        }

    }
}
