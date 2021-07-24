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
                if(di.vertices[vertice].size()==0)continue;//fixme mudança feita para arrumar o arrayOutOfBounds que dava quando chamava o metodo
                p = di.vertices[v = vertice].get(k);

                if (custos[p.verticeDestino] > custos[vertice] + p.peso){
                    custos[p.verticeDestino] = custos[vertice] + p.peso;
                }
            }
        }

        /*
        Print de custos LEMBRAR DE TIRAR NA ENTREGA.
         */
        for (int xc = 0; xc < custos.length; xc++){
            System.out.print("Para " + xc + " O custo é: " + custos[xc] + ", ");
        }
        System.out.println(" ");

    }
}
