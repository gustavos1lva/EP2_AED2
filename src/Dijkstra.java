public class Dijkstra extends Fila {

    public Vertice[] parentes;
    double int[] custos;

    public Dijkstra(Digrafo di) {
        super(di);
        di.inicializaVertices(parentes);
    }

    public void Djikstra(Digrafo di, Vertice vert) {

        int v,w;
        Vertice p;

        for (v = 0; v < di.v; v++){
            custos[v] = (int) Math.pow(10,900);

        }
    }
}
