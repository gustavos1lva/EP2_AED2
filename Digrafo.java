import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Digrafo {

    private int v = 0;
    private int a = 0;
    List<Arcos>[] vertices;

    public Digrafo(int v){
        this.v = v;
        vertices = new LinkedList[v];
        inicializaVertices();
    }

    public void inicializaVertices(){
        for (int i = 0; i < v; i++){
            this.vertices[i] = new LinkedList<Arcos>();
        }
    }

    public void insercaoAleatoria(int n, double p, int k){
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (i == j) continue;
                boolean random = (Math.random() < p) ? true : false;
                if (random){
                    Random fodase = new Random();
                    int c = fodase.nextInt(k - 0);
                    vertices[i].add(new Arcos(i , j, c));
                    a++;
                } 
            }
        }
    }

    public void mostraDigrafo(){
        for (int i = 0; i < vertices.length; i++) {
            System.out.println("-----------------------------------------");
            for (int j = 0; j < vertices[i].size(); j++) {
                if (j == 0) {
                    System.out.println("Vertice: " + vertices[i].get(j).verticeInicio);
                    System.out.println("Endereços das arestas: " + vertices[i]);
                    System.out.println("Qtd de arestas dele: " + vertices[i].size());
                }
                System.out.println("Aresta " + j + " vai pro vertice:" + vertices[i].get(j).verticeDestino);
                System.out.println("Peso dessa aresta: " + vertices[i].get(j).peso);
            }
        }
    }
}
