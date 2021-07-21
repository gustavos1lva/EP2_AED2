import java.util.List;

public class DagMin {
    public void DagMin(Digrafo di, int v){
        int[] custos = new int[di.v];
        int infinito = (di.k*di.v)+1;

        int i, vertice;
        Arco p;

        for (vertice = 0; vertice < di.v; vertice++){
            custos[vertice] = infinito;
        }

        custos[v] = 0;

        for (vertice = 0 ; vertice < di.v; vertice++){

            if (custos[vertice] == infinito) continue;
            for (int k = 0; k < di.vertices[v].size(); k++){
                p = di.vertices[v = vertice].get(k);

                if (custos[p.verticeDestino] > custos[vertice] + p.peso){
                    custos[p.verticeDestino] = custos[vertice] + p.peso;
                }
            }
        }

        for (int j = 0; j < custos.length; j++){
            System.out.println("Vertice: " + j + " tem custo: " + custos[j] + " do vertice inicial");
        }

    }
}
