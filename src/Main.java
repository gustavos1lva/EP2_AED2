/*
    EP2 AED2 - Turma 94 - Alexandre Freire
    Gustavo Ryan Nascimento Silva - 11796785
    Bruno Daniel Moreira Plada - 11796274
 */

import org.w3c.dom.ls.LSOutput;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    static int contAlg = 0;
    public static boolean existeGrafo = false;
    public static void main(String[] args) {

        /*
        Digrafo di = new Digrafo(6);
        di.vertices[0].add(new Arco(0,3,2));
        di.vertices[0].add(new Arco(0,2,7));
        di.vertices[0].add(new Arco(0,4,4));
        di.vertices[2].add(new Arco(2,4,1));
        di.vertices[3].add(new Arco(3,4,1));
        di.vertices[3].add(new Arco(3,5,3));
        di.vertices[4].add(new Arco(4,5,1));
        di.vertices[4].add(new Arco(4,1,4));
        di.vertices[5].add(new Arco(5,1,2));
        di.vertices[1].add(new Arco(1,2,0));

        Dijkstra ord = new Dijkstra();
        ord.Dijkstra(di, 0);

         */


        Digrafo di = null;
        Scanner s = new Scanner(System.in);
        System.out.println("Selecione um: " + "\n" + "1. Criar um digrafo" + "\n" + "2. Testar digrafo ja existente" + "\n" + "3. Encerrar o programa");
        int oqFazer = s.nextInt();
        while(oqFazer != 3) {

            switch (oqFazer){
                case 1:
                    di = insercao(s);
                    break;
                case 2:
                    testaAlg(s,di);
            }


            System.out.println("Selecione um: " + "\n" + "1. Criar um digrafo" + "\n" + "2. Testar digrafo ja existente" + "\n" + "3. Encerrar o programa");
            oqFazer = s.nextInt();
        }

    }

    public static void testaAlg(Scanner s, Digrafo di){
        System.out.println("Insira o numero da operação desejada: " + "\n"
                + "1: Dijkstra" + "\n" + "2: DAGMin" + "\n" + "3: BellmanFord");
        int ops = s.nextInt();
        switch (ops) {
            case 1:
                System.out.println("Insira o vertice inicial desejado para o caminho de Dijkstra: ");
                int inicialDijkstra = s.nextInt();
                Dijkstra dj = new Dijkstra();
                long start = System.currentTimeMillis();
                dj.Dijkstra(di, inicialDijkstra);
                long end = System.currentTimeMillis();
                System.out.println("O tempo de execução foi: " + (end - start) + "ms");
                break;
            case 2:
                System.out.println("Insira o vertice inicial desejado para o caminho de DAGMin: ");
                int inicialDag = s.nextInt();
                DagMin dag = new DagMin();
                long startD = System.currentTimeMillis();
                dag.DagMin(di, inicialDag);
                long endD = System.currentTimeMillis();
                System.out.println("O tempo de execução foi: " + (endD - startD) + "ms");
                break;
            case 3:
                System.out.println("Insira o vertice inicial desejado para o caminho de BellmanFord: ");
                int inicialBell = s.nextInt();
                BellmanFord bell = new BellmanFord();
                long startB = System.currentTimeMillis();
                bell.bellman_ford(di, inicialBell);
                long endB = System.currentTimeMillis();
                System.out.println("O tempo de execução foi: " + (endB - startB) + "ms");
                break;
        }
    contAlg++;
    }

    public static Digrafo insercao(Scanner s){
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
            case 1:
                di.insercaoAleatoria(p, pesoArco);
                System.out.println("Digrafo criado!");
                break;
            case 2:
                di.insercaoAleatoriaDAG(p, pesoArco);
                System.out.println("DAG Criado!");
                break;
        }
    existeGrafo = true;
    return di;
    }

}
