public class Main {
    public static void main(String[] args) {
        Digrafo di = new Digrafo(5);
        di.insercaoAleatoria(5,0.2,4);

        System.out.println("Digrafo Atual: ");
        di.mostraDigrafo();

        Dijkstra dj = new Dijkstra();
        System.out.println("-------------------------------------DEPOIS DO DIJKSTRA------------------------------------------");
        dj.Djikstra(di,0);

    }
}
