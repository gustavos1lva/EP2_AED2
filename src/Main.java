import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Insira quantos vertices vc quer: ");
        int vertices = s.nextInt();
        Digrafo di = new Digrafo(vertices);
        System.out.println("Insira o p desejado(entre 0 e 1): ");
        double p = s.nextDouble();
        System.out.println("Insira o peso maximo de arco: ");
        int pesoArco = s.nextInt();
        System.out.println("Insira o tipo de digrafo desejado: " + "\n" + "1: Normal " + "\n" + "2: DAG");
        int tipo = s.nextInt();

        switch (tipo) {
            case 1 -> di.insercaoAleatoria(p, pesoArco);
            case 2 -> di.insercaoAleatoriaDAG(p, pesoArco);
        }

        System.out.println("Insira o numero da operação desejada: " + "\n"
        + "1: Dijkstra" + "\n" + "2: DAGMin" + "\n" + "3: BellmanFord");
        int ops = s.nextInt();
        switch (ops) {
            case 1 -> {
                System.out.println("Insira o vertice inicial desejado para o caminho de Dijkstra: ");
                int inicialDijkstra = s.nextInt();
                Dijkstra dj = new Dijkstra();
                dj.Dijkstra(di, inicialDijkstra);
            }
            case 2 -> {
                System.out.println("Insira o vertice inicial desejado para o caminho de DAGMin: ");
                int inicialDag = s.nextInt();
                DagMin dag = new DagMin();
                dag.DagMin(di, inicialDag);
            }
            case 3 -> {
                System.out.println("Insira o vertice inicial desejado para o caminho de BellmanFord: ");
                int inicialBell = s.nextInt();
                BellmanFord bell = new BellmanFord();
                bell.bellman_ford(di, inicialBell);
            }
        }

    }
}
