public class Main {
    public static void main(String[] args) {
        /*
        Digrafo di = new Digrafo(5);
        di.insercaoAleatoria(0.2,4);

        System.out.println("Digrafo Atual: ");
        di.mostraDigrafo();

        Dijkstra dj = new Dijkstra();
        System.out.println("-------------------------------------DEPOIS DO DIJKSTRA------------------------------------------");
        dj.Djikstra(di,0);
         */

        Digrafo di = new Digrafo(6,7);
        di.vertices[0].add(new Arco(0,2,7));
        di.vertices[0].add(new Arco(0,4,4));
        di.vertices[0].add(new Arco(0,3,2));
        di.vertices[2].add(new Arco(2,4,1));
        di.vertices[3].add(new Arco(3,4,1));
        di.vertices[3].add(new Arco(3,5,3));
        di.vertices[4].add(new Arco(4,1,4));
        di.vertices[4].add(new Arco(4,5,1));
        di.vertices[5].add(new Arco(5,1,2));
        di.vertices[1].add(new Arco(1,2,0));

        System.out.println("Digrafo Atual: ");
        di.mostraDigrafo();

        Dijkstra dj = new Dijkstra();
        System.out.println("-------------------------------------DEPOIS DO DIJKSTRA------------------------------------------");
        dj.Djikstra(di,0);
    }
}
